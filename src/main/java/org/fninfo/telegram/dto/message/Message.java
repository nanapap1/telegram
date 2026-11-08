package org.fninfo.telegram.dto.message;

import com.google.gson.annotations.SerializedName;
import org.fninfo.telegram.dto.chat.Chat;
import org.fninfo.telegram.dto.user.User;

public class Message {

    private static class NewMember {
        @SerializedName("status")
        private String memberStatus;

        public NewMember() {
        }
    }

    @SerializedName("message_id")
    private Long message_id;

    @SerializedName("text")
    private String text;

    @SerializedName("media_group_id")
    private String media_group_id;

    @SerializedName("from")
    private User user;

    @SerializedName("chat")
    private Chat chat;

    @SerializedName("reply_to_message")
    private Message reply;

    public Message() {
    }
}

