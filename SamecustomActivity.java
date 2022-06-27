package com.example.nailmanna;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import yuku.ambilwarna.AmbilWarnaDialog;


public class SamecustomActivity extends AppCompatActivity {
    // text view variable to set the color for GFG text
    private TextView gfgTextView;

    // two buttons to open color picker dialog and one to
    // set the color for GFG text
    private Button mSetColorButton, mPickColorButton;

    // view box to preview the selected color
    private View mColorPreview;

    // this is the default color of the preview box
    private int mDefaultColor;

    //nail image picture
    private ImageView t8dada8;
    private ImageView t89a1ad;
    private ImageView a8a5c4;
    private ImageView b78187;
    private ImageView cfb2a1;
    private ImageView da603f;
    private ImageView efca61;
    private ImageView e84f73;
    private ImageView dc7e76;

    //gucci
    private ImageView a6fa449;
    private ImageView a88c099;
    private ImageView ece7df;
    private ImageView ebafa5;
    private ImageView df675c;
    private ImageView a20005;
    private ImageView bl;

    //Leav
    private ImageView nail1;
    private ImageView nail2;
    private ImageView nail3;
    private ImageView nail4;
    private ImageView nail5;
    private ImageView nail6;
    private ImageView nail7;
    private ImageView nail8;
    private ImageView nail9;
    private ImageView nail10;

    //from
    private ImageView f1;
    private ImageView f2;
    private ImageView f3;
    private ImageView f4;
    private ImageView f5;
    private ImageView f6;
    private ImageView f7;
    private ImageView f8;
    private ImageView f9;

    private HorizontalScrollView modi,gucci, leav, from;

    //same custom activity set
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_samecustom);

        modi = (HorizontalScrollView)findViewById(R.id.modi);
        gucci= (HorizontalScrollView)findViewById(R.id.gucci);
        leav = (HorizontalScrollView)findViewById(R.id.leav);
        from = (HorizontalScrollView)findViewById(R.id.from);

        //manicure image
        t89a1ad = findViewById(R.id.t89a1ad);
        a8a5c4 = findViewById(R.id.a8a5c4);
        t8dada8 = findViewById(R.id.t8dada8);
        b78187 = findViewById(R.id.b78187);
        cfb2a1 = findViewById(R.id.cfb2a1);
        da603f = findViewById(R.id.da603f);
        efca61 = findViewById(R.id.efca61);
        e84f73 = findViewById(R.id.e84f73);
        dc7e76 = findViewById(R.id.dc7e76);

        //gucci

        a6fa449 = findViewById(R.id.a6fa449);
        a88c099 = findViewById(R.id.a88c099);
        ece7df = findViewById(R.id.ece7df);
        ebafa5 = findViewById(R.id.ebafa5);
        df675c = findViewById(R.id.df675c);
        a20005 = findViewById(R.id.a20005);
        bl = findViewById(R.id.bl);

        nail1 = findViewById(R.id.nail1);
        nail2 = findViewById(R.id.nail2);
        nail3 = findViewById(R.id.nail3);
        nail4 = findViewById(R.id.nail4);
        nail5 = findViewById(R.id.nail5);
        nail6 = findViewById(R.id.nail6);
        nail7 = findViewById(R.id.nail7);
        nail8 = findViewById(R.id.nail8);
        nail9 = findViewById(R.id.nail9);
        nail10 = findViewById(R.id.nail10);

        f1 = findViewById(R.id.f1);
        f2 = findViewById(R.id.f2);
        f3 = findViewById(R.id.f3);
        f4 = findViewById(R.id.f4);
        f5 = findViewById(R.id.f5);
        f6 = findViewById(R.id.f6);
        f7 = findViewById(R.id.f7);
        f8 = findViewById(R.id.f8);
        f9 = findViewById(R.id.f9);


        // register the GFG text with appropriate ID
        gfgTextView = findViewById(R.id.gfg_heading);

        // register two of the buttons with their
        // appropriate IDs
        mPickColorButton = findViewById(R.id.pick_color_button);
        mSetColorButton = findViewById(R.id.set_color_button);

        // and also register the view which shows the
        // preview of the color chosen by the user
        mColorPreview = findViewById(R.id.preview_selected_color);

        // set the default color to 0 as it is black
        mDefaultColor = 0;

        // button open the AmbilWanra color picker dialog.
        mPickColorButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // to make code look cleaner the color
                        // picker dialog functionality are
                        // handled in openColorPickerDialogue()
                        // function
                        openColorPickerDialogue();
                    }
                });

        // button to set the color GFG text
        mSetColorButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // as the mDefaultColor is the global
                        // variable its value will be changed as
                        // soon as ok button is clicked from the
                        // color picker dialog.
                        gfgTextView.setTextColor(mDefaultColor);
                    }
                });



        // 개별지정 버튼 클릭 시 select화면 전환
        Button selectpage = (Button) findViewById(R.id.selectpage);
        selectpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SelecthandActivity.class);
                startActivity(intent);
            }
        });

//        // 이미지로 설정하기 선택 시 pictuerActivity로 전환
//        Button imgsetting = (Button) findViewById(R.id.imgsetting);
//        imgsetting.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(),PictureActivity.class);
//                startActivity(intent);
//            }
//        });

        // 완료하기 선택 시 finishactivity로 전환
        Button done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),FinishActivity.class);
                startActivity(intent);
            }
        });

        ImageView modi_iv = (ImageView)findViewById(R.id.modi_iv);
        modi_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gucci.setVisibility(View.GONE);
                leav.setVisibility(View.GONE);
                from.setVisibility(View.GONE);
                modi.setVisibility(View.VISIBLE);
            }
        });

        ImageView gucci_iv = (ImageView)findViewById(R.id.gucci_iv);
        gucci_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modi.setVisibility(View.GONE);
                leav.setVisibility(View.GONE);
                from.setVisibility(View.GONE);
                gucci.setVisibility(View.VISIBLE);
            }
        });

        ImageView leav_iv = (ImageView)findViewById(R.id.leav_iv);
        leav_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modi.setVisibility(View.GONE);
                gucci.setVisibility(View.GONE);
                from.setVisibility(View.GONE);
                leav.setVisibility(View.VISIBLE);
            }
        });

        ImageView from_iv = (ImageView)findViewById(R.id.from_iv);
        from_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modi.setVisibility(View.GONE);
                gucci.setVisibility(View.GONE);
                leav.setVisibility(View.GONE);
                from.setVisibility(View.VISIBLE);
            }
        });

        t89a1ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-8344127);
                commonData.getInstance().SetColorpick(toRGBString(-8344127));
                defcolorset();
            }
        });
        a8a5c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-4811314);
                commonData.getInstance().SetColorpick(toRGBString(-4811314));
                defcolorset();
            }
        });
        t8dada8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-7948880);
                commonData.getInstance().SetColorpick(toRGBString(-7948880));
                defcolorset();
            }
        });
        b78187.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-2916713);
                commonData.getInstance().SetColorpick(toRGBString(-2916713));
                defcolorset();
            }
        });
        cfb2a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-1321033);
                commonData.getInstance().SetColorpick(toRGBString(-1321033));
                defcolorset();
            }
        });
        da603f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-370600);
                commonData.getInstance().SetColorpick(toRGBString(-370600));
                defcolorset();
            }
        });
        efca61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-1455018);
                commonData.getInstance().SetColorpick(toRGBString(-1455018));
                defcolorset();
            }
        });
        e84f73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-1485215);
                commonData.getInstance().SetColorpick(toRGBString(-1485215));
                defcolorset();

            }
        });
        dc7e76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-1076611);
                commonData.getInstance().SetColorpick(toRGBString(-1076611));
                defcolorset();
            }
        });

        //gucci
        a6fa449.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-9522073);
                commonData.getInstance().SetColorpick(toRGBString(-9522073));
                defcolorset();
            }
        });
        a88c099.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-10435946);
                commonData.getInstance().SetColorpick(toRGBString(-10435946));
                defcolorset();
            }
        });
        ece7df.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-1053714);
                commonData.getInstance().SetColorpick(toRGBString(-1053714));
                defcolorset();
            }
        });
        ebafa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-1856854);
                commonData.getInstance().SetColorpick(toRGBString(-1856854));
                defcolorset();
            }
        });
        df675c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-2663376);
                commonData.getInstance().SetColorpick(toRGBString(-2663376));
                defcolorset();
            }
        });
        a20005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-5500141);
                commonData.getInstance().SetColorpick(toRGBString(-5500141));
                defcolorset();
            }
        });
        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-14464348);
                commonData.getInstance().SetColorpick(toRGBString(-14464348));
                defcolorset();
            }
        });

        //Leav
        nail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-6674350);
                commonData.getInstance().SetColorpick(toRGBString(-6674350));
                defcolorset();
            }
        });
        nail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-3842466);
                commonData.getInstance().SetColorpick(toRGBString(-3842466));
                defcolorset();
            }
        });
        nail3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-3112040);
                commonData.getInstance().SetColorpick(toRGBString(-3112040));
                defcolorset();
            }
        });
        nail4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-6058153);
                commonData.getInstance().SetColorpick(toRGBString(-6058153));
                defcolorset();
            }
        });
        nail5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-3891657);
                commonData.getInstance().SetColorpick(toRGBString(-3891657));
                defcolorset();
            }
        });
        nail6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-2310436);
                commonData.getInstance().SetColorpick(toRGBString(-2310436));
                defcolorset();
            }
        });
        nail7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-4884299);
                commonData.getInstance().SetColorpick(toRGBString(-4884299));
                defcolorset();
            }
        });
        nail8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-12974278);
                commonData.getInstance().SetColorpick(toRGBString(-12974278));
                defcolorset();
            }
        });
        nail9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-4494801);
                commonData.getInstance().SetColorpick(toRGBString(-4494801));
                defcolorset();
            }
        });
        nail10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-13648991);
                commonData.getInstance().SetColorpick(toRGBString(-13648991));
                defcolorset();
            }
        });
        //from
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-11582396);
                commonData.getInstance().SetColorpick(toRGBString(-11582396));
                defcolorset();
            }
        });
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-5540776);
                commonData.getInstance().SetColorpick(toRGBString(-5540776));
                defcolorset();
            }
        });
        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-6071756);
                commonData.getInstance().SetColorpick(toRGBString(-6071756));
                defcolorset();
            }
        });
        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-1863793);
                commonData.getInstance().SetColorpick(toRGBString(-1863793));
                defcolorset();
            }
        });
        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-5346512);
                commonData.getInstance().SetColorpick(toRGBString(-5346512));
                defcolorset();
            }
        });
        f6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-5598854);
                commonData.getInstance().SetColorpick(toRGBString(-5598854));
                defcolorset();
            }
        });
        f7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-8097697);
                commonData.getInstance().SetColorpick(toRGBString(-8097697));
                defcolorset();
            }
        });
        f8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-9942222);
                commonData.getInstance().SetColorpick(toRGBString(-9942222));
                defcolorset();
            }
        });
        f9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mColorPreview.setBackgroundColor(-10274539);
                commonData.getInstance().SetColorpick(toRGBString(-10274539));
                defcolorset();
            }
        });


    }
    public void openColorPickerDialogue() {

        // the AmbilWarnaDialog callback needs 3 parameters
        // one is the context, second is default color,
        final AmbilWarnaDialog colorPickerDialogue = new AmbilWarnaDialog(this, mDefaultColor,
                new AmbilWarnaDialog.OnAmbilWarnaListener() {
                    @Override
                    public void onCancel(AmbilWarnaDialog dialog) {
                        // leave this function body as
                        // blank, as the dialog
                        // automatically closes when
                        // clicked on cancel button
                    }

                    @Override
                    public void onOk(AmbilWarnaDialog dialog, int color) {
                        // change the mDefaultColor to
                        // change the GFG text color as
                        // it is returned when the OK
                        // button is clicked from the
                        // color picker dialog
                        toRGBString(color);
                        mDefaultColor = color;

                        // now change the picked color
                        // preview box to mDefaultColor
                        Log.e("colorch", "====>"+toRGBString(color));

                        commonData.getInstance().SetColorpick(toRGBString(color));

                        for( int i = 1; i < 7 ; i++ ){
                            if( commonData.getInstance().GetSelectNo() == i ){
                                commonData.getInstance().SetHandColor(i,commonData.getInstance().GetColorpick());
                            }
                        }
                        //엄지를 선택할 경우
                        if( commonData.getInstance().GetSelectNo() == 6 ){
                            // 모두 동일 버튼을 선택 할 경우
                            commonData.getInstance().setColor1(commonData.getInstance().GetColorpick());
                            commonData.getInstance().setColor2( commonData.getInstance().GetColorpick() );
                            commonData.getInstance().setColor3( commonData.getInstance().GetColorpick() );
                            commonData.getInstance().setColor4( commonData.getInstance().GetColorpick() );
                            commonData.getInstance().setColor5( commonData.getInstance().GetColorpick() );
                        }
                        Log.e("colorcheak","=====>"+commonData.getInstance().Getserversand());
                        Log.e("ColorCh","=====>"+commonData.getInstance().getColor1());

                        mColorPreview.setBackgroundColor(mDefaultColor);
                    }
                });
        colorPickerDialogue.show();
    }


    public String toRGBString(int color) {
        // format: #RRGGBB
        String red = Integer.toHexString(Color.red(color));
        String green = Integer.toHexString(Color.green(color));
        String blue = Integer.toHexString(Color.blue(color));

        if (red.length() == 1)
            red = "0" + red;
        if (green.length() == 1)
            green = "0" + green;
        if (blue.length() == 1)
            blue = "0" + blue;
        return "#" + red + green + blue;

    }

    public void defcolorset(){

        for( int i = 1; i < 6 ; i++ ){
            if( commonData.getInstance().GetSelectNo() == i ){
                commonData.getInstance().SetHandColor(i,commonData.getInstance().GetColorpick());
            }
        }
        //엄지를 선택할 경우
        if( commonData.getInstance().GetSelectNo() == 1 ){
            commonData.getInstance().setColor1(commonData.getInstance().GetColorpick());
        }else if( commonData.getInstance().GetSelectNo() == 2 ){
            commonData.getInstance().setColor2(commonData.getInstance().GetColorpick());
        }else if( commonData.getInstance().GetSelectNo() == 3 ){
            commonData.getInstance().setColor3(commonData.getInstance().GetColorpick());
        }else if( commonData.getInstance().GetSelectNo() == 4 ){
            commonData.getInstance().setColor4(commonData.getInstance().GetColorpick());
        }else if( commonData.getInstance().GetSelectNo() == 5 ){
            commonData.getInstance().setColor5(commonData.getInstance().GetColorpick());
        }else if( commonData.getInstance().GetSelectNo() == 6 ) {
            // 모두 동일 버튼을 선택 할 경우
            commonData.getInstance().setColor1(commonData.getInstance().GetColorpick());
            commonData.getInstance().setColor2(commonData.getInstance().GetColorpick());
            commonData.getInstance().setColor3(commonData.getInstance().GetColorpick());
            commonData.getInstance().setColor4(commonData.getInstance().GetColorpick());
            commonData.getInstance().setColor5(commonData.getInstance().GetColorpick());
        }
    }
}
