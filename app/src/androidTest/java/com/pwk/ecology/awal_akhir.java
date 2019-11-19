package com.pwk.ecology;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.pressImeActionButton;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class awal_akhir {

    @Rule
    public ActivityTestRule<ScrollingActivity> mActivityTestRule = new ActivityTestRule<>(ScrollingActivity.class);

    @Test
    public void awal_akhir() {
        ViewInteraction floatingActionButton = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton.perform(click());

        ViewInteraction textInputEditText = onView(
                allOf(withId(R.id.kota),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.kabupaten),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText.perform(replaceText("Jogja"), closeSoftKeyboard());

        ViewInteraction textInputEditText2 = onView(
                allOf(withId(R.id.luas_wilayah),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.wilayah),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText2.perform(replaceText("32842"), closeSoftKeyboard());

        ViewInteraction textInputEditText3 = onView(
                allOf(withId(R.id.jml_penduduk),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.penduduk),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText3.perform(replaceText("3074883"), closeSoftKeyboard());

        ViewInteraction textInputEditText4 = onView(
                allOf(withId(R.id.jml_kk),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.kk),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText4.perform(replaceText("768720"), closeSoftKeyboard());

        ViewInteraction textInputEditText5 = onView(
                allOf(withId(R.id.jml_kk), withText("768720"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.kk),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText5.perform(pressImeActionButton());

        ViewInteraction appCompatImageButton = onView(
                allOf(withId(R.id.intro_btn_next),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        2),
                                2),
                        isDisplayed()));
        appCompatImageButton.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.luas_padii), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                1)));
        appCompatEditText.perform(scrollTo(), click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.luas_padii), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                1)));
        appCompatEditText2.perform(scrollTo(), replaceText("2017"));

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.luas_padii), withText("2017"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.luas_jagung), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                3)));
        appCompatEditText4.perform(scrollTo(), replaceText("103"));

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.luas_jagung), withText("103"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                3),
                        isDisplayed()));
        appCompatEditText5.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.luas_kacanghijau), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                9)));
        appCompatEditText6.perform(scrollTo(), replaceText("14"));

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.luas_kacanghijau), withText("14"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                9),
                        isDisplayed()));
        appCompatEditText7.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText8 = onView(
                allOf(withId(R.id.ton_padi), withText("0"),
                        childAtPosition(
                                allOf(withId(R.id.padii),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                0)));
        appCompatEditText8.perform(scrollTo(), replaceText("10568"));

        ViewInteraction appCompatEditText9 = onView(
                allOf(withId(R.id.ton_padi), withText("10568"),
                        childAtPosition(
                                allOf(withId(R.id.padii),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatEditText9.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText10 = onView(
                allOf(withId(R.id.ton_jagung), withText("0"),
                        childAtPosition(
                                allOf(withId(R.id.jagungg),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                3)),
                                0)));
        appCompatEditText10.perform(scrollTo(), replaceText("503"));

        ViewInteraction appCompatEditText11 = onView(
                allOf(withId(R.id.ton_jagung), withText("503"),
                        childAtPosition(
                                allOf(withId(R.id.jagungg),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                3)),
                                0),
                        isDisplayed()));
        appCompatEditText11.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText12 = onView(
                allOf(withId(R.id.ton_jagung), withText("503"),
                        childAtPosition(
                                allOf(withId(R.id.jagungg),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                3)),
                                0)));

        ViewInteraction appCompatEditText13 = onView(
                allOf(withId(R.id.ton_kacanghijau), withText("0"),
                        childAtPosition(
                                allOf(withId(R.id.hijauu),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                9)),
                                0)));
        appCompatEditText13.perform(scrollTo(), replaceText("21"));

        ViewInteraction appCompatEditText14 = onView(
                allOf(withId(R.id.ton_kacanghijau), withText("21"),
                        childAtPosition(
                                allOf(withId(R.id.hijauu),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                9)),
                                0),
                        isDisplayed()));
        appCompatEditText14.perform(closeSoftKeyboard());

        ViewInteraction appCompatImageButton2 = onView(
                allOf(withId(R.id.intro_btn_next),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        2),
                                2),
                        isDisplayed()));
        appCompatImageButton2.perform(click());

        ViewInteraction appCompatImageButton3 = onView(
                allOf(withId(R.id.intro_btn_next),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        2),
                                2),
                        isDisplayed()));
        appCompatImageButton3.perform(click());

        ViewInteraction appCompatEditText15 = onView(
                allOf(withId(R.id.ton_ikantawar), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1),
                        isDisplayed()));
        appCompatEditText15.perform(replaceText("8160"));

        ViewInteraction appCompatEditText16 = onView(
                allOf(withId(R.id.ton_ikantawar), withText("8160"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1),
                        isDisplayed()));
        appCompatEditText16.perform(closeSoftKeyboard());

        ViewInteraction appCompatImageButton4 = onView(
                allOf(withId(R.id.intro_btn_next),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        2),
                                2),
                        isDisplayed()));
        appCompatImageButton4.perform(click());

        ViewInteraction appCompatImageButton5 = onView(
                allOf(withId(R.id.intro_btn_next),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        2),
                                2),
                        isDisplayed()));
        appCompatImageButton5.perform(click());

        ViewInteraction appCompatEditText17 = onView(
                allOf(withId(R.id.jml_kendaraankecil), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText17.perform(click());

        ViewInteraction appCompatEditText18 = onView(
                allOf(withId(R.id.jml_kendaraankecil), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText18.perform(replaceText("174694"));

        ViewInteraction appCompatEditText19 = onView(
                allOf(withId(R.id.jml_kendaraankecil), withText("174694"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText19.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText20 = onView(
                allOf(withId(R.id.jml_kendaraankecil), withText("174694"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText20.perform(click());

        ViewInteraction appCompatEditText21 = onView(
                allOf(withId(R.id.jml_kendaraankecil), withText("174694"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText21.perform(replaceText("1746934"));

        ViewInteraction appCompatEditText22 = onView(
                allOf(withId(R.id.jml_kendaraankecil), withText("1746934"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText22.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText23 = onView(
                allOf(withId(R.id.jml_kendaraanbesar), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                3),
                        isDisplayed()));
        appCompatEditText23.perform(replaceText("379234"));

        ViewInteraction appCompatEditText24 = onView(
                allOf(withId(R.id.jml_kendaraanbesar), withText("379234"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                3),
                        isDisplayed()));
        appCompatEditText24.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText25 = onView(
                allOf(withId(R.id.jml_rumah_tangga), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                5),
                        isDisplayed()));
        appCompatEditText25.perform(replaceText("2746476"));

        ViewInteraction appCompatEditText26 = onView(
                allOf(withId(R.id.jml_rumah_tangga), withText("2746476"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                5),
                        isDisplayed()));
        appCompatEditText26.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText27 = onView(
                allOf(withId(R.id.ed_listrik_rm), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1),
                        isDisplayed()));
        appCompatEditText27.perform(replaceText("2746476"));

        ViewInteraction appCompatEditText28 = onView(
                allOf(withId(R.id.ed_listrik_rm), withText("2746476"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1),
                        isDisplayed()));
        appCompatEditText28.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText29 = onView(
                allOf(withId(R.id.ed_listrik_industri), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                3),
                        isDisplayed()));
        appCompatEditText29.perform(replaceText("3184677"));

        ViewInteraction appCompatEditText30 = onView(
                allOf(withId(R.id.ed_listrik_industri), withText("3184677"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                3),
                        isDisplayed()));
        appCompatEditText30.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText31 = onView(
                allOf(withId(R.id.ed_listrik_bangunanSos), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                5),
                        isDisplayed()));
        appCompatEditText31.perform(replaceText("640645"));

        ViewInteraction appCompatEditText32 = onView(
                allOf(withId(R.id.ed_listrik_bangunanSos), withText("640645"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                5),
                        isDisplayed()));
        appCompatEditText32.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText33 = onView(
                allOf(withId(R.id.ed_listrik_bangunanKom), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                7),
                        isDisplayed()));
        appCompatEditText33.perform(replaceText("2126383"));

        ViewInteraction appCompatEditText34 = onView(
                allOf(withId(R.id.ed_listrik_bangunanKom), withText("2126383"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                7),
                        isDisplayed()));
        appCompatEditText34.perform(closeSoftKeyboard());

        ViewInteraction appCompatImageButton6 = onView(
                allOf(withId(R.id.intro_btn_next),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        2),
                                2),
                        isDisplayed()));
        appCompatImageButton6.perform(click());

        ViewInteraction appCompatImageButton7 = onView(
                allOf(withId(R.id.intro_btn_next),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        2),
                                2),
                        isDisplayed()));
        appCompatImageButton7.perform(click());

        ViewInteraction materialButton = onView(
                allOf(withId(R.id.intro_btn_finish), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        2),
                                1),
                        isDisplayed()));
        materialButton.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
