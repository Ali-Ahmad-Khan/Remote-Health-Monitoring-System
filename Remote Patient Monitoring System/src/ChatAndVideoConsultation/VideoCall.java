package ChatAndVideoConsultation;

import java.util.Random;
import java.util.Scanner;

public class VideoCall {
    public static void initiateCall(int senderId) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ID of the person you want to video call: ");
        int receiverId = sc.nextInt();

        String meetLink = generateMeetLink();

        System.out.println("\n[VideoCall] Sending Meet link to both parties...");
        System.out.println("Join here: " + meetLink);

        // In a real system, this would be created using Google Calendar API and 2FA would be implemented
    }

    private static String generateMeetLink() {
        return "https://meet.google.com/" +
                randomBlock(3) + "-" +
                randomBlock(4) + "-" +
                randomBlock(3);
    }

    private static String randomBlock(int length) {              //random generation of a meet link format
        String chars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder block = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            block.append(chars.charAt(r.nextInt(chars.length())));
        }
        return block.toString();
    }
}
