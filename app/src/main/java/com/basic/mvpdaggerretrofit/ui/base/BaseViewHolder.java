package com.basic.mvpdaggerretrofit.ui.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;



/**
 * Created by manu on 2/19/2018.
 */

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bind(Object model);

}