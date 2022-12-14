// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView accountheader;

  @NonNull
  public final EditText address;

  @NonNull
  public final EditText email;

  @NonNull
  public final TextView header;

  @NonNull
  public final EditText mobile;

  @NonNull
  public final EditText profile;

  @NonNull
  public final TextView txtaddress;

  @NonNull
  public final TextView txtemail;

  @NonNull
  public final TextView txtmobile;

  @NonNull
  public final TextView txtname;

  @NonNull
  public final Button update;

  private FragmentProfileBinding(@NonNull RelativeLayout rootView, @NonNull TextView accountheader,
      @NonNull EditText address, @NonNull EditText email, @NonNull TextView header,
      @NonNull EditText mobile, @NonNull EditText profile, @NonNull TextView txtaddress,
      @NonNull TextView txtemail, @NonNull TextView txtmobile, @NonNull TextView txtname,
      @NonNull Button update) {
    this.rootView = rootView;
    this.accountheader = accountheader;
    this.address = address;
    this.email = email;
    this.header = header;
    this.mobile = mobile;
    this.profile = profile;
    this.txtaddress = txtaddress;
    this.txtemail = txtemail;
    this.txtmobile = txtmobile;
    this.txtname = txtname;
    this.update = update;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.accountheader;
      TextView accountheader = ViewBindings.findChildViewById(rootView, id);
      if (accountheader == null) {
        break missingId;
      }

      id = R.id.address;
      EditText address = ViewBindings.findChildViewById(rootView, id);
      if (address == null) {
        break missingId;
      }

      id = R.id.email;
      EditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.header;
      TextView header = ViewBindings.findChildViewById(rootView, id);
      if (header == null) {
        break missingId;
      }

      id = R.id.mobile;
      EditText mobile = ViewBindings.findChildViewById(rootView, id);
      if (mobile == null) {
        break missingId;
      }

      id = R.id.profile;
      EditText profile = ViewBindings.findChildViewById(rootView, id);
      if (profile == null) {
        break missingId;
      }

      id = R.id.txtaddress;
      TextView txtaddress = ViewBindings.findChildViewById(rootView, id);
      if (txtaddress == null) {
        break missingId;
      }

      id = R.id.txtemail;
      TextView txtemail = ViewBindings.findChildViewById(rootView, id);
      if (txtemail == null) {
        break missingId;
      }

      id = R.id.txtmobile;
      TextView txtmobile = ViewBindings.findChildViewById(rootView, id);
      if (txtmobile == null) {
        break missingId;
      }

      id = R.id.txtname;
      TextView txtname = ViewBindings.findChildViewById(rootView, id);
      if (txtname == null) {
        break missingId;
      }

      id = R.id.update;
      Button update = ViewBindings.findChildViewById(rootView, id);
      if (update == null) {
        break missingId;
      }

      return new FragmentProfileBinding((RelativeLayout) rootView, accountheader, address, email,
          header, mobile, profile, txtaddress, txtemail, txtmobile, txtname, update);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
