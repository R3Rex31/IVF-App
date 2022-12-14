// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TopsItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final RoundedImageView topImg;

  @NonNull
  public final TextView topName;

  private TopsItemBinding(@NonNull CardView rootView, @NonNull RoundedImageView topImg,
      @NonNull TextView topName) {
    this.rootView = rootView;
    this.topImg = topImg;
    this.topName = topName;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static TopsItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TopsItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.tops_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TopsItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.top_img;
      RoundedImageView topImg = ViewBindings.findChildViewById(rootView, id);
      if (topImg == null) {
        break missingId;
      }

      id = R.id.top_name;
      TextView topName = ViewBindings.findChildViewById(rootView, id);
      if (topName == null) {
        break missingId;
      }

      return new TopsItemBinding((CardView) rootView, topImg, topName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
