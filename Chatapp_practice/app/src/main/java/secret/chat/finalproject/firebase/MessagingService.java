package secret.chat.finalproject.firebase;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MessagingService extends FirebaseMessagingService {
    //票證(與伺服器對話時會用到)
    @Override
    public void onNewToken(@NonNull String token){
        super.onNewToken(token);
    }

    //遠程消息
    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage){
        super.onMessageReceived(remoteMessage);
    }
}
