// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailedBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageView additem;

  @NonNull
  public final Button addtocart;

  @NonNull
  public final View divider;

  @NonNull
  public final TextView highlights;

  @NonNull
  public final ImageView prodimg;

  @NonNull
  public final TextView prodname;

  @NonNull
  public final TextView prodprice;

  @NonNull
  public final TextView quantity;

  @NonNull
  public final ImageView removeitem;

  private ActivityDetailedBinding(@NonNull ScrollView rootView, @NonNull ImageView additem,
      @NonNull Button addtocart, @NonNull View divider, @NonNull TextView highlights,
      @NonNull ImageView prodimg, @NonNull TextView prodname, @NonNull TextView prodprice,
      @NonNull TextView quantity, @NonNull ImageView removeitem) {
    this.rootView = rootView;
    this.additem = additem;
    this.addtocart = addtocart;
    this.divider = divider;
    this.highlights = highlights;
    this.prodimg = prodimg;
    this.prodname = prodname;
    this.prodprice = prodprice;
    this.quantity = quantity;
    this.removeitem = removeitem;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detailed, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.additem;
      ImageView additem = ViewBindings.findChildViewById(rootView, id);
      if (additem == null) {
        break missingId;
      }

      id = R.id.addtocart;
      Button addtocart = ViewBindings.findChildViewById(rootView, id);
      if (addtocart == null) {
        break missingId;
      }

      id = R.id.divider;
      View divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.highlights;
      TextView highlights = ViewBindings.findChildViewById(rootView, id);
      if (highlights == null) {
        break missingId;
      }

      id = R.id.prodimg;
      ImageView prodimg = ViewBindings.findChildViewById(rootView, id);
      if (prodimg == null) {
        break missingId;
      }

      id = R.id.prodname;
      TextView prodname = ViewBindings.findChildViewById(rootView, id);
      if (prodname == null) {
        break missingId;
      }

      id = R.id.prodprice;
      TextView prodprice = ViewBindings.findChildViewById(rootView, id);
      if (prodprice == null) {
        break missingId;
      }

      id = R.id.quantity;
      TextView quantity = ViewBindings.findChildViewById(rootView, id);
      if (quantity == null) {
        break missingId;
      }

      id = R.id.removeitem;
      ImageView removeitem = ViewBindings.findChildViewById(rootView, id);
      if (removeitem == null) {
        break missingId;
      }

      return new ActivityDetailedBinding((ScrollView) rootView, additem, addtocart, divider,
          highlights, prodimg, prodname, prodprice, quantity, removeitem);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}