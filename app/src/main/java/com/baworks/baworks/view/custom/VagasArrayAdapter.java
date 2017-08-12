package com.baworks.baworks.view.custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.baworks.baworks.R;
import com.baworks.baworks.model.pojo.Vaga;

/**
 * Created by daniel on 8/12/17.
 */

public class VagasArrayAdapter extends ArrayAdapter<Vaga> {

    private int resource = 0;
    private LayoutInflater inflater;
    private Context context;

    public VagasArrayAdapter(Context context, int resource) {
        super(context, resource);

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.resource = resource;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = null;
        ViewHolder viewHolder = null;

        if (convertView == null) {

            viewHolder = new ViewHolder();

            view = inflater.inflate(resource, parent, false);

            viewHolder.txtTituloVaga = (TextView) view.findViewById(R.id.txt_titulo_vaga);
            viewHolder.txtDescVaga = (TextView) view.findViewById(R.id.txt_desc_vaga);

            view.setTag(viewHolder);

            convertView = view;
        }
        else {

            viewHolder = (ViewHolder) convertView.getTag();
            view = convertView;
        }

        Vaga vaga = getItem(position);

        viewHolder.txtTituloVaga.setText("> " + vaga.getTitulo());
        viewHolder.txtDescVaga.setText(vaga.getDescricao());

        return view;
    }

    static class ViewHolder {

        TextView txtTituloVaga;
        TextView txtDescVaga;
    }
}