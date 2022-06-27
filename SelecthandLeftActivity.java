package com.example.nailmanna;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SelecthandLeftActivity extends AppCompatActivity {

    Button test, test1, test2, test3, test4, samebutton, done;
    TextView infotext, info;
    String path;

    // 손가락 or 전체 선택 화면
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_selecthandleft);

        test = findViewById(R.id.test);
        test1 = findViewById(R.id.test1);
        test2 = findViewById(R.id.test2);
        test3 = findViewById(R.id.test3);
        test4 = findViewById(R.id.test4);
        samebutton = findViewById(R.id.allsame);
        info = findViewById(R.id.textView10);
        infotext = findViewById(R.id.infotext);
        done = findViewById(R.id.done);

        //해시맵 값이 있을 경우 완료버튼을 보이게 하고, 다른 버튼은 invisibility하게 하기
        if(commonData.getInstance().GetHandSelect(1) !=0 || commonData.getInstance().GetHandSelect(2) !=0  || commonData.getInstance().GetHandSelect(3) !=0  || commonData.getInstance().GetHandSelect(4) !=0  || commonData.getInstance().GetHandSelect(5) !=0 ) {
            samebutton.setVisibility(View.GONE);
            info.setVisibility(View.GONE);
            infotext.setVisibility(View.GONE);
        }

        if(commonData.getInstance().GetHandSelect(1) == 1 && commonData.getInstance().GetHandSelect(2) == 2  && commonData.getInstance().GetHandSelect(3) == 3 && commonData.getInstance().GetHandSelect(4) == 4  && commonData.getInstance().GetHandSelect(5) == 5 ) {
            done.setVisibility(View.VISIBLE);
        }

        //사진 불러오기
        if( commonData.getInstance().GetLastImageURL() != ""){
            ImageView showImage = (ImageView) findViewById(R.id.show_image);
            Uri uri = Uri.parse("file:///" + commonData.getInstance().GetLastImageURL() );
            showImage.setImageURI(uri);
        }

        // back 버튼 클릭 시 cam화면으로 전환
        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                commonData.getInstance().SetLeftHand(0);
                Intent intent = new Intent( getApplicationContext(), DirectionActivity.class );
                startActivity(intent);
            }
        });

        // 모두동일 버튼 클릭 시 custom화면으로 전환
        samebutton = findViewById(R.id.allsame);
        samebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), SamecustomActivity.class );
                startActivity(intent);
                commonData.getInstance().SetSelectNo(6);

            }
        });

        // 완료하기 버튼 클릭 시 완료화면으로 전환
        done = findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), FinishActivity.class );
                startActivity(intent);
            }
        });

        //설정한 버튼 set.backgroundcolor
        if( commonData.getInstance().GetHandSelect(1) == 1 ){
            test.setBackgroundColor(Color.parseColor(commonData.getInstance().GetHandColor(1)));
        }
        if(commonData.getInstance().GetHandSelect(2) == 2 ){
            test1.setBackgroundColor(Color.parseColor(commonData.getInstance().GetHandColor(2)));
        }
        if(commonData.getInstance().GetHandSelect(3) == 3 ){
            test2.setBackgroundColor(Color.parseColor(commonData.getInstance().GetHandColor(3)));
        }
        if(commonData.getInstance().GetHandSelect(4) == 4 ){
            test3.setBackgroundColor(Color.parseColor(commonData.getInstance().GetHandColor(4)));
        }
        if(commonData.getInstance().GetHandSelect(5) == 5 ){
            test4.setBackgroundColor(Color.parseColor(commonData.getInstance().GetHandColor(5)));
        }

        //손가락에따른 버튼 클릭 시 액티비티 전환
        test.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), CustomActivity.class );
                startActivity(intent);
                commonData.getInstance().SetHandSelect(1,1);
                commonData.getInstance().SetSelectNo(1);
            }
        });

        //손가락에따른 버튼 클릭 시 액티비티 전환
        test1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), CustomActivity.class );
                startActivity(intent);
                commonData.getInstance().SetHandSelect(2,2);
                commonData.getInstance().SetSelectNo(2);
            }
        });

        //손가락에따른 버튼 클릭 시 액티비티 전환
        test2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), CustomActivity.class );
                startActivity(intent);
                commonData.getInstance().SetHandSelect(3,3);
                commonData.getInstance().SetSelectNo(3);
            }
        });
        //손가락에따른 버튼 클릭 시 액티비티 전환
        test3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), CustomActivity.class );
                startActivity(intent);
                commonData.getInstance().SetHandSelect(4,4);
                commonData.getInstance().SetSelectNo(4);
            }
        });

        //손가락에따른 버튼 클릭 시 액티비티 전환
        test4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), CustomActivity.class );
                startActivity(intent);
                commonData.getInstance().SetHandSelect(5,5);
                commonData.getInstance().SetSelectNo(5);
                Log.e("handselectarray", "===>"+commonData.getInstance().GetHandSelect(1));

//                for(Map.Entry<Integer, Integer> i : commonData.getInstance().GetHandSelect().entrySet() ){
//                    Log.i("say", "key = [ "+ i.getKey() +"] value = [" + i.getValue() +"] ");
//                }
            }
        });
    }


}