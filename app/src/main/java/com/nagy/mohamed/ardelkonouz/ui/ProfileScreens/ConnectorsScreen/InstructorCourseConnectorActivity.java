package com.nagy.mohamed.ardelkonouz.ui.ProfileScreens.ConnectorsScreen;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.WindowManager;

import com.nagy.mohamed.ardelkonouz.R;
import com.nagy.mohamed.ardelkonouz.helper.Constants;
import com.nagy.mohamed.ardelkonouz.ui.ProfileScreens.InstructorProfileActivity;

public class InstructorCourseConnectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructor_course_connector);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Drawable upArrow = getResources().getDrawable(R.drawable.ic_keyboard_arrow_left_black_36dp);
        upArrow.setTint(Color.WHITE);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home:
                openInstructorProfile();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void openInstructorProfile(){
        Long INSTRUCTOR_ID = getIntent().getExtras().getLong(Constants.INSTRUCTOR_ID_EXTRA);

        Intent profileInstructorScreen = new Intent(this, InstructorProfileActivity.class);
        profileInstructorScreen.putExtra(Constants.INSTRUCTOR_ID_EXTRA, INSTRUCTOR_ID);
        startActivity(profileInstructorScreen);
        NavUtils.navigateUpTo(this, profileInstructorScreen);
    }

    @Override
    public void onBackPressed() {
        openInstructorProfile();
    }
}
