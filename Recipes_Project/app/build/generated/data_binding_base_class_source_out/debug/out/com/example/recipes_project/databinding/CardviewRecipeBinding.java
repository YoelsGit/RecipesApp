// Generated by view binder compiler. Do not edit!
package com.example.recipes_project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.recipes_project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CardviewRecipeBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageButton heartButton;

  @NonNull
  public final ImageView recipeImage;

  @NonNull
  public final TextView recipeSummary;

  @NonNull
  public final TextView recipeTitle;

  private CardviewRecipeBinding(@NonNull CardView rootView, @NonNull ImageButton heartButton,
      @NonNull ImageView recipeImage, @NonNull TextView recipeSummary,
      @NonNull TextView recipeTitle) {
    this.rootView = rootView;
    this.heartButton = heartButton;
    this.recipeImage = recipeImage;
    this.recipeSummary = recipeSummary;
    this.recipeTitle = recipeTitle;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CardviewRecipeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CardviewRecipeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.cardview_recipe, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CardviewRecipeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.heartButton;
      ImageButton heartButton = ViewBindings.findChildViewById(rootView, id);
      if (heartButton == null) {
        break missingId;
      }

      id = R.id.recipeImage;
      ImageView recipeImage = ViewBindings.findChildViewById(rootView, id);
      if (recipeImage == null) {
        break missingId;
      }

      id = R.id.recipeSummary;
      TextView recipeSummary = ViewBindings.findChildViewById(rootView, id);
      if (recipeSummary == null) {
        break missingId;
      }

      id = R.id.recipeTitle;
      TextView recipeTitle = ViewBindings.findChildViewById(rootView, id);
      if (recipeTitle == null) {
        break missingId;
      }

      return new CardviewRecipeBinding((CardView) rootView, heartButton, recipeImage, recipeSummary,
          recipeTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
