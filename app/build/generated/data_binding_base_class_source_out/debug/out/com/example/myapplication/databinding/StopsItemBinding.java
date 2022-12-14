// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class StopsItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView additem;

  @NonNull
  public final Button addtocart;

  @NonNull
  public final View divider;

  @NonNull
  public final TextView quantity;

  @NonNull
  public final ImageView removeitem;

  @NonNull
  public final TextView topsNavDescription;

  @NonNull
  public final ImageView topsNavImg;

  @NonNull
  public final TextView topsNavName;

  @NonNull
  public final TextView topsNavPrice;

  private StopsItemBinding(@NonNull CardView rootView, @NonNull ImageView additem,
      @NonNull Button addtocart, @NonNull View divider, @NonNull TextView quantity,
      @NonNull ImageView removeitem, @NonNull TextView topsNavDescription,
      @NonNull ImageView topsNavImg, @NonNull TextView topsNavName,
      @NonNull TextView topsNavPrice) {
    this.rootView = rootView;
    this.additem = additem;
    this.addtocart = addtocart;
    this.divider = divider;
    this.quantity = quantity;
    this.removeitem = removeitem;
    this.topsNavDescription = topsNavDescription;
    this.topsNavImg = topsNavImg;
    this.topsNavName = topsNavName;
    this.topsNavPrice = topsNavPrice;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static StopsItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StopsItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.stops_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StopsItemBinding bind(@NonNull View rootView) {
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

      id = R.id.tops_nav_description;
      TextView topsNavDescription = ViewBindings.findChildViewById(rootView, id);
      if (topsNavDescription == null) {
        break missingId;
      }

      id = R.id.tops_nav_img;
      ImageView topsNavImg = ViewBindings.findChildViewById(rootView, id);
      if (topsNavImg == null) {
        break missingId;
      }

      id = R.id.tops_nav_name;
      TextView topsNavName = ViewBindings.findChildViewById(rootView, id);
      if (topsNavName == null) {
        break missingId;
      }

      id = R.id.tops_nav_price;
      TextView topsNavPrice = ViewBindings.findChildViewById(rootView, id);
      if (topsNavPrice == null) {
        break missingId;
      }

      return new StopsItemBinding((CardView) rootView, additem, addtocart, divider, quantity,
          removeitem, topsNavDescription, topsNavImg, topsNavName, topsNavPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
