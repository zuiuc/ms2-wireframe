package com.qi_zhao.ms2_wireframe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity  {
    //GUI control  bound to screen1 (holding GidView)
    GridView gridview;

    ImageView imgSoloPhoto;


    Integer[] smallImages = {R.drawable.book_cover_1,
            R.drawable.book_cover_2, R.drawable.book_cover_3,
            R.drawable.book_cover_4,R.drawable.book_cover_5,
            R.drawable.book_cover_6,R.drawable.book_cover_7,
            R.drawable.book_cover_8,R.drawable.book_cover_9,
            R.drawable.book_cover_10,R.drawable.book_cover_11,
            R.drawable.book_cover_12,R.drawable.book_cover_13,
            R.drawable.book_cover_14,R.drawable.book_cover_15
    };


    //in case you want to use-save state values
    Bundle myOriginalMemoryBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        myOriginalMemoryBundle = savedInstanceState;
        // setup GridView with its custom adapter and listener
        gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new MyImageAdapter(this, smallImages));
        //gridview.setOnItemClickListener(this);

    }
}
