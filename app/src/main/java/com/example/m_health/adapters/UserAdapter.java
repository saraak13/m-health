// app/src/main/java/com/example/m_health/adapters/UserAdapter.java
package com.example.m_health.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.m_health.R;
import com.example.m_health.models.User;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

     private List<User> userList;
    private OnMoreButtonClickListener moreButtonClickListener;

    public interface OnMoreButtonClickListener {
        void onMoreButtonClick(View view, int position);
    }

    public void setOnMoreButtonClickListener(OnMoreButtonClickListener listener) {
        this.moreButtonClickListener = listener;
    }

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_user, parent, false);
        return new UserViewHolder(view);
    }

   @Override
public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
    User user = userList.get(position);
    holder.textViewName.setText(user.getFullName());
    holder.textViewEmail.setText(user.getEmail());
    holder.textViewRole.setText(user.getRole());
    
    // Set click listener for the more button
    holder.buttonMore.setOnClickListener(view -> {
        if (moreButtonClickListener != null) {
            moreButtonClickListener.onMoreButtonClick(view, position);
        }
    });
}

    @Override
    public int getItemCount() {
        return userList.size();
    }

    static class UserViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName, textViewEmail, textViewRole;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewEmail = itemView.findViewById(R.id.textViewEmail);
            textViewRole = itemView.findViewById(R.id.textViewRole);
        }
          static class UserViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView imageViewAvatar;
        TextView textViewName, textViewEmail, textViewRole;
        ImageButton buttonMore;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
          imageViewAvatar = itemView.findViewById(R.id.imageViewAvatar);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewEmail = itemView.findViewById(R.id.textViewEmail);
            textViewRole = itemView.findViewById(R.id.textViewRole);
            buttonMore = itemView.findViewById(R.id.buttonMore);
        }
    }
    }

}