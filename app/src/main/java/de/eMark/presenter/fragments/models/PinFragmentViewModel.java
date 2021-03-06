package de.eMark.presenter.fragments.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import de.eMark.BR;
import de.eMark.R;

public class PinFragmentViewModel extends BaseObservable {

    private String title;
    private String message;

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyPropertyChanged(BR.message);
    }

    @Bindable
    public String getMessage() {
        return message;
    }

    public int getKeyboardTextColor() {
        return R.color.keyboard_text_color;
    }
}
