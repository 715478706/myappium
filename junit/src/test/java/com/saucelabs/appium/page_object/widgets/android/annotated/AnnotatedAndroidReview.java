package com.saucelabs.appium.page_object.widgets.android.annotated;

import com.saucelabs.appium.page_object.widgets.android.simple.AndroidReview;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import org.openqa.selenium.WebElement;

@AndroidFindBys({@AndroidBy(id = "android:id/content"),
        @AndroidBy(className = "android.widget.RelativeLayout")})
public class AnnotatedAndroidReview extends AndroidReview {

    protected AnnotatedAndroidReview(WebElement element) {
        super(element);
    }
}
