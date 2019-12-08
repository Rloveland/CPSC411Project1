package com.cpsc411.project1javatype;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout rootsRoot = new LinearLayout(this);
        ViewGroup.LayoutParams rParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        rootsRoot.setLayoutParams(rParams);
        rootsRoot.setOrientation(LinearLayout.VERTICAL);
        rootsRoot.setBackgroundColor(Color.WHITE);

        GridLayout root = new GridLayout(this);
        root.setLayoutParams(rParams);
        root.setBackgroundColor(Color.WHITE);
        root.setColumnCount(5);
        root.setRowCount(11);

        for(int i=1;i<12;i++){
            numbering(i,root);
        }

        TextView tv = new TextView(this);
        tv.setText("Rules void hello1(int hour)");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.WHITE);

        GridLayout.Spec row_spec = GridLayout.spec(0,1, GridLayout.FILL);
        GridLayout.Spec col_spec = GridLayout.spec(1, 4, GridLayout.FILL);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        cell("Properties", Color.WHITE, 1,1,1,2, Gravity.CENTER_HORIZONTAL, root);
        cell("Name", Color.WHITE, 1,2,2,1, Gravity.CENTER_HORIZONTAL, root);
        cell("Category", Color.WHITE, 2,2,2,1, Gravity.CENTER_HORIZONTAL, root);
        cell("Day Hour Classification", Color.WHITE, 1, 4, 1,1, Gravity.LEFT, root);
        cell("Day and Time", Color.WHITE, 2, 4, 1,1, Gravity.LEFT, root);
        cell("Rule", Color.CYAN, 3,1,1,1, Gravity.CENTER_HORIZONTAL, root);
        cell("C1", Color.CYAN, 3,2,2,1, Gravity.CENTER_HORIZONTAL, root);
        cell("A1", Color.CYAN, 3,4,1,1, Gravity.CENTER_HORIZONTAL, root);
        cell("", Color.CYAN, 4,1,1,1, Gravity.CENTER_HORIZONTAL, root);
        cell("min <= hour & hour => max", Color.CYAN, 4,2,2,1,0, root);
        cell("System.out.println(greetings + \", Hello!\")", Color.CYAN, 4,4,1,1, 0, root);
        cell("", Color.CYAN, 5,1,1,1, Gravity.CENTER_HORIZONTAL, root);
        cell("int min", Color.CYAN, 5,2,1,1, Gravity.CENTER_HORIZONTAL, root);
        cell("int max", Color.CYAN, 5,3,1,1, Gravity.CENTER_HORIZONTAL, root);
        cell("String greeting", Color.CYAN, 5,4,1,1, Gravity.CENTER_HORIZONTAL, root);
        cell("Rule", Color.WHITE, 6,1,1,1, Gravity.LEFT, root);
        cell("To", Color.YELLOW, 6,2,1,1, Gravity.LEFT, root);
        cell("From", Color.YELLOW, 6,3,1,1, Gravity.LEFT, root);
        cell("Greeting", Color.RED, 6,4,1,1, Gravity.LEFT, root);
        cell("R10", Color.WHITE, 7,1,1,1, Gravity.LEFT, root);
        cell("0", Color.YELLOW, 7,2,1,1, Gravity.RIGHT, root);
        cell("11", Color.YELLOW, 7,3,1,1, Gravity.RIGHT, root);
        cell("Good Morning", Color.RED, 7,4,1,1, Gravity.LEFT, root);
        cell("R20", Color.WHITE, 8,1,1,1, Gravity.LEFT, root);
        cell("12", Color.YELLOW, 8,2,1,1, Gravity.RIGHT, root);
        cell("17", Color.YELLOW, 8,3,1,1, Gravity.RIGHT, root);
        cell("Good Afternoon", Color.RED, 8,4,1,1, Gravity.LEFT, root);
        cell("R30", Color.WHITE, 9,1,1,1, Gravity.LEFT, root);
        cell("18", Color.YELLOW, 9,2,1,1, Gravity.RIGHT, root);
        cell("21", Color.YELLOW, 9,3,1,1, Gravity.RIGHT, root);
        cell("Good Evening", Color.RED, 9,4,1,1, Gravity.LEFT, root);
        cell("R40", Color.WHITE, 10,1,1,1, Gravity.LEFT, root);
        cell("22", Color.YELLOW, 10,2,1,1, Gravity.RIGHT, root);
        cell("23", Color.YELLOW, 10,3,1,1, Gravity.RIGHT, root);
        cell("Good Night", Color.RED, 10,4,1,1, Gravity.LEFT, root);



        rootsRoot.addView(root);
        setContentView(rootsRoot);

    }

    private void numbering(int pos, GridLayout root){
        TextView num =new TextView(this);
        num.setText(Integer.toString(pos));
        num.setTextSize(12);
        num.setBackgroundColor(Color.GRAY);

        GridLayout.Spec row_spec = GridLayout.spec(pos-1,GridLayout.FILL);
        GridLayout.Spec col_spec = GridLayout.spec(0,GridLayout.FILL);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        num.setLayoutParams(cParams);
        root.addView(num);
    }

    private void cell(String text, int color, int row, int col, int len, int height, int gravity, GridLayout root){
        TextView num = new TextView(this);
        num.setText(text);
        num.setTextSize(12);
        num.setBackgroundColor(color);

        GridLayout.Spec row_spec = GridLayout.spec(row, height,GridLayout.FILL);
        GridLayout.Spec col_spec = GridLayout.spec(col,len,GridLayout.FILL);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        num.setGravity(gravity|Gravity.CENTER_VERTICAL);
        num.setLayoutParams(cParams);
        root.addView(num);
    }
}
