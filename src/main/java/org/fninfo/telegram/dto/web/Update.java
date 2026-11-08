package org.fninfo.telegram.dto.web;

import com.google.gson.annotations.SerializedName;
import org.fninfo.telegram.dto.message.Message;

public class Update {
    @SerializedName("update_id")
    private Long update_id;
    @SerializedName("message")
    private Message message;

    public Update() {
    }
}
