package ChatAndVideoConsultation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChatServer {
    private static final HashMap<String, List<String>> chatLogs = new HashMap<>();

    public static void logMessage(int senderId, int receiverId, String message) {
        String key = senderId + "<->" + receiverId;
        chatLogs.putIfAbsent(key, new ArrayList<>());
        chatLogs.get(key).add("From " + senderId + ": " + message);
    }

    public static void viewChat(int userA, int userB) {
        String key = userA + "<->" + userB;
        if (!chatLogs.containsKey(key)) key = userB + "<->" + userA;
        if (chatLogs.containsKey(key)) {
            for (String msg : chatLogs.get(key)) {
                System.out.println(msg);
            }
        } else {
            System.out.println("No chat history found.");
        }
    }
}

