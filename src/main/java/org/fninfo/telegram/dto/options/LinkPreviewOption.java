package org.fninfo.telegram.dto.options;

import com.google.gson.annotations.SerializedName;

public class LinkPreviewOption {
    @SerializedName("is_disabled")
    private boolean is_disabled = true;
    @SerializedName("url")
    private String url;

    public LinkPreviewOption() {
    }

    public void changeStatus() {
        this.is_disabled = !this.is_disabled;
    }

    public boolean is_disabled() {
        return is_disabled;
    }
}