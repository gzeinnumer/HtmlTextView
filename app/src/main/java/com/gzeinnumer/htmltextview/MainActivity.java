package com.gzeinnumer.htmltextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.sufficientlysecure.htmltextview.HtmlHttpImageGetter;
import org.sufficientlysecure.htmltextview.HtmlTextView;

public class MainActivity extends AppCompatActivity {

    String html = "<h2>Superrrr</h2>"+
                    "<ul><li>Marvel</li></ul>"+
                    "<ul><li>DC</li></ul>"+
                    "<img src=\"https://avatars3.githubusercontent.com/u/45892408?s=460&v=4\"/>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HtmlTextView htmlTextView = findViewById(R.id.html);
        htmlTextView.setHtml(html,new HtmlHttpImageGetter(htmlTextView));
    }
}
