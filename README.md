# manual-android
android for me

### 아이콘 만들기

포토샵강좌 : http://blog.naver.com/PostView.nhn?blogId=godwings&logNo=220558432104&parentCategoryNo=&categoryNo=56&viewDate=&isShowPopularPosts=false&from=postView  
사이트 : http://icon.angrymarmot.org/  

### Reference

Index for Android Open Source Projects  
http://www.java2s.com/Open-Source/Android_Free_Code/  

simplifiedcoding  
https://www.simplifiedcoding.net  

안드로이드 Q&A  
http://www.masterqna.com/android/

Android Cheatsheet for Graphic Designers :  
http://petrnohejl.github.io/Android-Cheatsheet-For-Graphic-Designers/

Android sample for Developer :  
https://developer.android.com/samples/

The Busy Coder's Guide to Android Development :  
https://commonsware.com/Android/

apps-for-android :  
https://code.google.com/archive/p/apps-for-android/

List of free and open-source Android applications :  
https://en.wikipedia.org/wiki/List_of_free_and_open-source_Android_applications

Google I/O Android App :  
https://github.com/google/iosched

Newly added links :  
http://aopensource.com/

lastfm/lastfm-android :  
https://github.com/lastfm/lastfm-android

### 공부.....

Android 6.0(API 레벨 23)부터 사용자는 앱이 설치될 때가 아니라 앱이 실행되는 중에 앱에 권한을 부여합니다. 이 접근방식에서는 사용자가 앱을 설치하거나 업데이트할 때 권한을 부여할 필요가 없으므로 앱 설치 과정이 간소화됩니다. 또한 사용자가 앱의 기능을 더 세부적으로 제어할 수 있습니다. 예를 들어, 기기 위치가 아니라 카메라에 대한 액세스 권한을 카메라 앱에 부여하도록 선택할 수 있습니다. 사용자는 앱 설정 화면으로 이동하여 언제든지 권한을 취소할 수 있습니다.

### 단축키

ctrl + shift + u : 대문자,소문자 변환  
ctrl + alt + o : import 구문정리  
ctrl + alt + L : 자동정렬  
ctrl + d : 한줄 자동 복사  
ctrl + y : 한줄 자동 삭제  
ctrl + w : 단락선택

### 액셀 읽기, 쓰기
apache poi  
project - open moduls - jxl 검색  

### assets, 애셋 폴더만들기
app 오른쪽 마우스 folder - assets  

### 초기저장, 시작, 스플레시, intro, splash  
SharedPreferences  

### 텍스트 사이즈
 - TextAppearance.Small  : 14
 - TextAppearance.Medium : 18
 - TextAppearance.Large  : 22
 
### 안드로이드 텍스트 -> 스피치 

Android Speech To Text Tutorial :  
https://www.androidhive.info/2014/07/android-speech-to-text-tutorial/  

Android Text To Speech Tutorial :  
https://www.androidhive.info/2012/01/android-text-to-speech-tutorial/

```
        // TTS를 생성하고 OnInitListener로 초기화 한다.
        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != ERROR) {
                    // 언어를 선택한다.
                    tts.setLanguage(Locale.KOREAN);
                }
            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // editText에 있는 문장을 읽는다.
                tts.setPitch(2.0f);         // 음성 톤을 2.0배 올려준다.
                tts.setSpeechRate(1.0f);    // 읽는 속도는 기본 설정
                tts.speak(editText.getText().toString(),TextToSpeech.QUEUE_FLUSH, null);
            }
        });
```

Android Developers An introduction to Text-To-Speech in Android  
23 September 2009 :  
https://android-developers.googleblog.com/2009/09/introduction-to-text-to-speech-in.html  


### 체크박스, 체크,checkbox
```
    <CheckBox
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Check"
        android:id="@+id/check1"/>


출처: http://recipes4dev.tistory.com/133 [개발자를 위한 레시피]
```

체크 박스 클릭 이벤트 함수에서 선택 상태 알아내기.  
```
    CheckBox checkBox = (CheckBox) findViewById(R.id.check1) ;
    checkBox.setOnClickListener(new CheckBox.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (((CheckBox)v).isChecked()) {
                // TODO : CheckBox is checked.
            } else {
                // TODO : CheckBox is unchecked.
            }
        }
    }) ;


출처: http://recipes4dev.tistory.com/133 [개발자를 위한 레시피]
```

### 안드로이드 색깔 칼라
https://designguidelines.withgoogle.com/wearos/style/color.html#color-dark-color-palette-for-wear-os  

### 텍스트뷰, 이미지뷰 위에 글씨 
```
                    <TextView
                        android:id="@+id/relay_comment"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_centerInParent="true"
                        android:drawableTop="@drawable/ic_comment_white"
                        android:padding="5dp"
                        android:text="@string/relay_button_2"
                        android:textColor="@color/white"
                        tools:text="Comment" />
```

### 스피너, spinner, 텍스트선택리스트
```
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                tv.setText("position : " + position +
                        parent.getItemAtPosition(position));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });


    <Spinner
        android:id="@+id/spinner1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:entries="@array/city"/>


<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string-array name="city">
        <item >서울</item>
        <item >경기</item>
        <item >부천</item>
        <item >수원</item>
        <item >파주</item>
        <item >부산</item>
        <item >대전</item>
    </string-array>
</resources>


출처: http://bitsoul.tistory.com/43 [Happy Programmer~]

http://bitsoul.tistory.com/43

```

### RSA 암호화 복호화

source :   
http://nine01223.tistory.com/101  

### gradle default setting
```
    compile 'com.android.support:appcompat-v7:27.1.1'
    compile 'com.android.support:customtabs:27.1.1'
    compile "com.android.support:animated-vector-drawable:27.1.1"
    compile 'com.android.support:mediarouter-v7:27.1.1'
    compile 'com.android.support:recyclerview-v7:27.1.1'
    compile 'com.android.support:cardview-v7:27.1.1'
    compile 'com.android.support:design:27.1.1'
```

### border, 테두리, 경계선, 줄
```
border.xml
<?xml version="1.0" encoding="utf-8"?>

 <layer-list xmlns:android="http://schemas.android.com/apk/res/android">



	<item> 

	    <shape android:shape="rectangle">

	      <solid android:color="#d7d7d7" /> 

	    </shape>

	  </item>   

	    <item android:top="1dp" android:bottom="1dp">  

	     <shape android:shape="rectangle"> 

	      <solid android:color="#ffffff" />

	    </shape>

	   </item>    



 </layer-list> 
출처: http://ellordnet.tistory.com/27 [IT in MT]
```
### byte[] string 상호변환

source : https://frontjang.info/entry/Java-Byte-%EB%B0%B0%EC%97%B4%EA%B3%BC-%EB%B0%94%EC%9D%B4%EB%84%88%EB%A6%AC%EB%AC%B8%EC%9E%90%EC%97%B4-%EC%83%81%ED%98%B8-%EB%B3%80%ED%99%98%ED%95%98%EA%B8%B0  

### 안드로이드 키 key MD5 ,SHA1, SHA256 
디버그(debug) password : android , 릴리즈(Release) password : 본인이 설정한 패스워드  
```
md1, sha1,sha256 :
keytool -list -v -keystore c:\users\user\.android\debug.keystore

java bin :
C:\Program Files\Java\jdk1.8.0_121\bin

facebook : (default)
keytool - exportcert - alias androiddebugkey -keystore ~/.android/debug.keystore | openssl sha1 -binary | openssl base64

facebook : (complete)
c:\users\user\.android\debug.keystore
keytool -exportcert -alias androiddebugkey -keystore c:\Users\user\.android\debug.keystore | C:\OpenSSL-Win64\bin\openssl sha1 -binary | C:\OpenSSL-Win64\bin\openssl base64

openSSL down link : http://slproweb.com/products/Win32OpenSSL.html

C:\openssl-0.9.8k_X64\bin\openssl
```

### 실시간 시간 받아오기
```
// 한국 시간 TimeZone time
Date date = new Date();
DateFormat df = new SimpleDateFormat(
    "yyyy-MM-dd HH:mm:ss");
TimeZone time = TimeZone.getTimeZone("Asia/Seoul");
df.setTimeZone(time);
String str = df.format(date);

//출처: http://mainia.tistory.com/2246 [녹두장군 - 상상을 현실로]
```

```
long time = System.currentTimeMillis();
SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
String str = dayTime.format(new Date(time));
//: http://ra2kstar.tistory.com/123 [초보개발자 이야기.]
```

### 유튜브 예제코드  
https://www.programcreek.com/java-api-examples/?class=com.google.android.youtube.player.YouTubePlayer&method=setFullscreenControlFlags  

### 유튜브 인탠트 intent 실행  
```
Intent i = new Intent(Intent.ACTION_VIEW);
i.setData(Uri.parse(SAMPLE_VIDEO_URL));
i.setPackage("com.google.android.youtube"); // 어플리케이션 강제 설정.
startActivity(i);
```

### 유튜브 api 실행
0. jar파일다운 : https://developers.google.com/youtube/android/player/downloads/?hl=ko  
1. 구글api에서 프로젝트 생성  
2. 사용자 인증정보  
3. 패키지이름과 sha1 key를 집어넣는다  
4. 안드로이드 액티비티를 youtubebaseactivity로 상속받는다  
```
public class YoutubeActivity extends YouTubeBaseActivity {


    YouTubePlayerView youtubeView;
    Button button;
    YouTubePlayer.OnInitializedListener listener;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_2);


        button = (Button) findViewById((R.id.youtubeButton));
        youtubeView = (YouTubePlayerView) findViewById(R.id.youtubeView);
        listener = new YouTubePlayer.OnInitializedListener() {

            @Override

            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                // 비디오 아이디
                youTubePlayer.loadVideo("bOzk0OLz0Jc");

            }


            @Override

            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {


            }

        };


        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                // api 키 값
                youtubeView.initialize(getString(R.string.google_api_key), listener);

            }

        });


    }

}
```
5. 
```
    <com.google.android.youtube.player.YouTubePlayerView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:visibility="visible"
        android:layout_centerHorizontal="true"
        android:id="@+id/youtubeView"
        android:layout_alignParentTop="true" />
```

### NoSQL

Firebase Query NoSQL :   
https://www.youtube.com/watch?v=WacqhiI-g_o  

useful :  
https://firebase.googleblog.com/2013/10/queries-part-1-common-sql-queries.html?   utm_campaign=Firebase_featureoverview_education_database_en_11-18-16&utm_source=Firebase&utm_medium=yt-desc  

### 전환 프레임워크, transition framework
https://m.blog.naver.com/PostView.nhn?blogId=horajjan&logNo=220412381797&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F

### 웹뷰, nestedscrollview, 상단툴바, 사라짐, hide
문제는 웹뷰 다른 영역 들어갔을때 height가 커지면, 그 공백만큼 다른 크기가 작은 웹뷰가 늘어남  
```
<android.support.design.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <android.support.design.widget.AppBarLayout
        android:id="@+id/appbar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar">

        <android.support.v7.widget.Toolbar
            android:id="@+id/toolbar"
            android:layout_width="match_parent"
            android:layout_height="?attr/actionBarSize"
            android:background="@color/color_main"
            app:layout_scrollFlags="scroll|enterAlways"
            app:popupTheme="@style/ThemeOverlay.AppCompat.Light" />

    </android.support.design.widget.AppBarLayout>

    <TextView
        android:id="@+id/net_error_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:fadingEdge="none"
        android:gravity="center"
        android:text="접속이 원활하지 않습니다"
        android:visibility="gone"
        />

    <!--android:fillViewport="true"-->
    <!--android:nestedScrollingEnabled="false"-->
    <android.support.v4.widget.NestedScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="fill_vertical"
        app:layout_behavior="@string/appbar_scrolling_view_behavior">

        <!--<WebView-->
            <!--android:id="@+id/webview"-->
            <!--android:layout_width="match_parent"-->
            <!--android:layout_height="match_parent"/>-->

            <WebView
                android:id="@+id/activity_main_webview"
                android:fadingEdge="none"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                >

            </WebView>


    </android.support.v4.widget.NestedScrollView>
</android.support.design.widget.CoordinatorLayout>
```

### 문자열
```
- 문자열 자르기, 특정 문자 기준으로 가져가기

// @를 기준으로 문자열을 추출할 것이다.
String mail = "abced@naver.com";

// 먼저 @ 의 인덱스를 찾는다 - 인덱스 값: 5
int idx = mail.indexOf("@"); 

// @ 앞부분을 추출
// substring은 첫번째 지정한 인덱스는 포함하지 않는다.
// 아래의 경우는 첫번째 문자열인 a 부터 추출된다.
String mail1 = mail.substring(0, idx);

// 뒷부분을 추출
// 아래 substring은 @ 바로 뒷부분인 n부터 추출된다.
String mail2 = mail.substring(idx+1);

System.out.println("mail1 : "+mail1);
System.out.println("mail2 : "+mail2);


출처: http://all-record.tistory.com/118 [세상의 모든 기록]

```


```
- 문자치환

String a = "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세 ";	
//replaceAll([기존문자],[바꿀문자])
a= a.replaceAll("대한", "민국");
System.out.println(a);
//결과값 : 무궁화 삼천리 화려강산 민국사람 민국으로 길이 보전하세
```
### 화면회전, portrait, landscape, rotate, oncreate
android:configChanges="keyboardHidden|orientation"  

### 백터 vector 에러 안드로이드 minsdk 16

    defaultConfig {
        vectorDrawables.useSupportLibrary = true


### EditText 키보드 내리기,창내리기
```
InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
imm.hideSoftInputFromWindow(EditText.getWindowToken(), 0);

출처: http://itpangpang.xyz/304 [ITPangPang]
```

### 문자열 리소스
```
& : &amp;
< : &lt;
> : &gt;
' : &apos;
" : &quot;
출처 : http://www.w3schools.com/html/html_entities.asp

### 퍼미션 여러개

```
    /**
     * Prompts the user for permission to use the device location.
     */
    private void getPermission(){

            ActivityCompat.requestPermissions(getActivity(),
                    new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION,
                                        Manifest.permission.CALL_PHONE
                    },
                    1000);

    }

```
```
    private void getPermission(){


        //    <uses-permission android:name="android.permission.INTERNET" />
        //    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
        //    <uses-permission android:name="android.permission.READ_PHONE_STATE" />
        //    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
        //    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />

        ActivityCompat.requestPermissions(RemoteLifeActivity.this,
                new String[]{Manifest.permission.INTERNET,
                        Manifest.permission.ACCESS_NETWORK_STATE,
                        Manifest.permission.READ_PHONE_STATE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE
                },
                1000);

    }
```
```

### 앱 종료하기
```
    public void actionExit() {

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        //dlg.setTitle("버튼 1개 대화상자"); // 제목
        dlg.setMessage(getString(R.string.action_exit_question)); // 내용
        //dlg.setIcon(R.drawable.ic_launcher); // 아이콘

        dlg.setNegativeButton(getString(R.string.message_yes), new  DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // onClick 메소드 매개변수가 DialogInterface 여야하네.
                //Toast.makeText(dlg.this, "good",0).show();


                moveTaskToBack(true);
                finish();

                //출처: http://whose.tistory.com/443 [Whose Tistory?!]
            }
        });

        dlg.setPositiveButton(getString(R.string.message_no), new  DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // onClick 메소드 매개변수가 DialogInterface 여야하네.
                //Toast.makeText(this, "종료",0).show();

            }
        });

        dlg.show(); // 보이다

    }
```

### 핑거푸시, pingerpush
```
1. 내꺼 github 다운받기
2. projects - app - src - main - assets 
#APP_KEY = 핑거푸시 App key
#APP_SECRET = 핑거푸시 App Secret
#GOOGLE_PROJECT_ID = FCM 발신자(Sender) ID, 포스트맨 넣었던거 넣으
바꾸기
3. build 후 핑거푸시 계정에 active 계정 1 뜨는지확인
4. 푸시알림 해보기
```

기타옵션   
```
자동 푸시 (Automated Push Notification)

자동 푸시란
앱 제공자 서버의 고객DB와 핑거 푸시 서버의 디바이스 ID를 매칭하여
앱 사용자(회원)의 활동이나 상태의 변화에 따라 자동으로 발송되도록
설정한 알림으로, 보다 밀착된 고객 관리가 가능합니다.

[활용 가능한 분야]
전체 (회원가입, 생일 축하, 등급 업그레이드, 포인트 적립 및 소멸 안내 등)
온라인 쇼핑 (결제 알림, 배송 알림, 쿠폰 발행, 장바구니 상품 품절/마감 알림, 재입고 알림 등)
오프라인 매장 (예약 확인, 방문고객 감사, 스탬프 적립 등)
이러닝 (학습진도 관리, 콘텐츠 업데이트 알림 등)

타겟팅 푸시 (Targeted Push Notification)

타겟팅 푸시란
앱 제공자가 서버에서 직접 타겟팅 하여 발송하는 푸시 알림으로, 고객별 맞춤형 정보 제공이 가능합니다.
[활용 가능한 분야]
연령/성별/지역에 따른 고객별 추천상품 안내
회원등급별 할인율 차등 적용된 쿠폰 발송
특정 상품 구매자 대상 공지
```

### inputstream <-> filepath, 인풋스트림, 파일패스
InputStream is = new FileInputStream(strDir);  

### 안드로이드 메뉴, 툴바
```
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //return super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.action_settings:
                // User chose the "Settings" item, show the app settings UI...
                Toast.makeText(getApplicationContext(), "환경설정 버튼 클릭됨", Toast.LENGTH_LONG).show();
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                Toast.makeText(getApplicationContext(), "나머지 버튼 클릭됨", Toast.LENGTH_LONG).show();
                return super.onOptionsItemSelected(item);

        }
    }
    ```

```
@Override
public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu, this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main2, menu);
    return true;
}

    public void setToolbar(){

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Main Page");
        }

        toolbar.setSubtitle("Test Subtitle");
        toolbar.inflateMenu(R.menu.menu);
    }
    
    <?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">

    <item
        android:id="@+id/menu_share"
        android:icon="@drawable/ic_share"
        android:orderInCategory="100"
        app:showAsAction="always"
        android:title="Setting" />

    <item
        android:id="@+id/menu_menu"
        android:icon="@drawable/ic_menu"
        android:orderInCategory="200"
        app:showAsAction="always"
        android:title="Setting" />

</menu>

```

### 안드로이드 백버튼,뒤로가기, 홈버튼
```
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(getResources().getDrawable(R.drawable.ic_back_main));
```
```
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int i = item.getItemId();

        if(i == android.R.id.home) {
            onBackPressed();
            overridePendingTransition(0,0); //if Activitiy conversioned, no animation
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
```
### 색깔 소스
getResources().getColor(R.color.white)  

### Edittext focuse 해제
```
android:focusable="true"
 android:focusableInTouchMode="true"
출처: http://gogorchg.tistory.com/entry/Android-EditText-자동-포커스-제거 [항상 초심으로]
```

### BottomNavtionView 위아래줄, 밑줄
```
    <android.support.design.widget.BottomNavigationView
        android:id="@+id/bottom_navigation"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        app:itemBackground="@drawable/my_background_bottom_layer"
        app:itemIconTint="@color/color_main"
        app:itemTextColor="@color/gray"
        app:menu="@menu/bottom_navigation"
        app:layout_insetEdge="bottom"
        app:elevation="8dp"
        />
```

my_background_bottom_layer  
```
<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="rectangle">
            <solid android:color="#d7d7d7" />
        </shape>
    </item>
    <item android:top="1dp">
        <shape android:shape="rectangle">
            <solid android:color="@color/white" />
        </shape>
    </item>
</layer-list>
```

### recoding, file, uri로 삭제하기
```
                    AlertDialog.Builder alert_confirm = new AlertDialog.Builder(context);
                    alert_confirm.setMessage("녹음파일을 삭제하시겠습니까?").setCancelable(false).setPositiveButton("확인",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // 'YES'

                                    int position = getAdapterPosition();
                                    Recording recording = recordingArrayList.get(position);

                                    Uri uri = Uri.parse(recording.getUri());
                                    File file = new File(uri.getPath());

                                    if( file.exists() ){
                                        if(file.delete()){
                                            System.out.println("파일삭제 성공");
                                            recordingArrayList.remove(position);
                                        }else{
                                            System.out.println("파일삭제 실패");
                                        }
                                    }else{
                                        System.out.println("파일이 존재하지 않습니다.");
                                    }

                                    notifyItemChanged(position);
                                    notifyDataSetChanged();

                                }
                            }).setNegativeButton("취소",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // 'No'
                                    return;
                                }
                            });
                    AlertDialog alert = alert_confirm.create();
                    alert.show();
```
### 플로팅액션버튼 floatingactionbutton
```
                                <android.support.design.widget.FloatingActionButton
                                    android:layout_centerInParent="true"
                                    android:layout_width="wrap_content"
                                    android:layout_height="wrap_content"
                                    android:id="@+id/btn_1"
                                    android:backgroundTint="#12FFF7"
                                    app:elevation="6dp"
                                    app:borderWidth="0dp"
                                    android:src="@drawable/ic_radio_button_checked_black_24dp"

                                    />
```
코드로 색깔 못바꿈
그냥 눌럿을떄 효과? 정도
```
                       btn1.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));  
                        btn1.setRippleColor(Color.BLUE);  
			```

### 날짜 선택, 글자클릭, 날짜 초이스, 데이트픽커
```
    private DatePickerDialog datePickerDialog;
    DatePickerDialog.OnDateSetListener date;
    final Calendar myCalendar = Calendar.getInstance();
```

```

        date = new
                DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear,
                                          int dayOfMonth) {
                        // TODO Auto-generated method stub
                        myCalendar.set(Calendar.YEAR, year);
                        myCalendar.set(Calendar.MONTH, monthOfYear);
                        myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

                        String myFormat = "MM/dd/yy"; //In which you need put here
                        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
                        btnDateNext.setText(sdf.format(myCalendar.getTime()));
                    }

                };


```

```
        btnDateNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new DatePickerDialog(ReservationActivity.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();

            }
        });

```

### 키해시
https://developers.kakao.com/docs/android

### 안드로이드 다음 API 지도
개발자 및 앱 등록 :  
https://developers.kakao.com/

오류해결 :  
https://blog.naver.com/jogilsang/221393218449

SDK 다운 및 예제 :  
http://apis.map.daum.net/android/guide/

```
    public void setDaumMapCurrentLocation(double latitude, double longitude) {

        // 중심점 변경
        mapView.setMapCenterPoint(MapPoint.mapPointWithGeoCoord(latitude, longitude), true);

        // 줌 레벨 변경
        mapView.setZoomLevel(4, true);
        
        // 중심점 변경 + 줌 레벨 변경
        //mapView.setMapCenterPointAndZoomLevel(MapPoint.mapPointWithGeoCoord(latitude, longitude), 9, true);
        
        // 줌 인
        mapView.zoomIn(true);
        
        // 줌 아웃
        //mapView.zoomOut(true);

        // 마커 생성
        setDaumMapCurrentMarker();

    }
    
    public void setDaumMapCurrentMarker(){

        MapPOIItem marker = new MapPOIItem();
        marker.setItemName("현재 위치");
        marker.setTag(0);
        marker.setMapPoint(MapPoint.mapPointWithGeoCoord(latitude, longitude));
        marker.setMarkerType(MapPOIItem.MarkerType.BluePin); // 기본으로 제공하는 BluePin 마커 모양.
        marker.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin); // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.

        mapView.addPOIItem(marker);


    }
```

### svg -> vector 변환
변환 사이트 :  
http://inloop.github.io/svg2android/

### 나인패치 작업하기

3번쨰 파일 색깔 체워서 각각 수정하고,
에러뜰수있음. 나인패치에러고 다시 

### gradient (그래디언트)
앵글별 정리 :
https://blog.naver.com/jogilsang/221393957129

참고사이트 :  
https://uigradients.com/#FacebookMessenger

참고소스 :  
```
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle"
    >

    <gradient
        android:startColor="#00c6ff"
        android:endColor="#0072ff"
        android:angle="270"
        android:type="linear"
        ></gradient>
</shape>
```

### 리사이클러뷰 RecyclerView 마지막,최하단 움직이기
```
recyclerview의 scrollToPosition 를 이용하여 이동 
mPingListAtapter.add(PingContent.createItem(mIndex++, (String) data)); 
mPingList.scrollToPosition(mPingListAtapter.getItemCount() - 1);
```

### 위치정보 가져오기
```
Geocoder 설명 
https://m.blog.naver.com/PostView.nhn?blogId=trylsj&logNo=220708881021&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F#

위도,경도 예제( 퍼미션 코드 따로넣어야함 )
http://bitsoul.tistory.com/135

getContryname() : 국가명  
getAdminArea() : 시  
getLocality() : 인천시 서구 -> 인천시  
getSubLocality() : 인천시 서구 -> 서구  
getThoroughfare() : 동  
getSubThoroughfare() : 번지  
getFeatureName() : 번지  
getAddressLine(0).toString() // 국가명 시 군 구 동 번지  

// 위치제공자 권한 true,false 
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 위치기반 어플리케이션 : 사용자의 위치를 활용한 어플리케이션
        // 폰에서 위치정보를 얻는 방법
        // 1. GPS - 위성에서 정보를 받아 삼각측량으로 위치를 계산,
        //           정확하다, 건물 안에서는 안된다
        // 2. 3G망 - 인접된 전화기지국에서오는 전파의 시간 차이로 위치를 계산,
        //          실내에서도 가능
        // 3. WiFi 의 AP

        // ■ 위치정보를 사용하려면, 권한 설정을 해야함 AndroidManifest.xml
        //           android.permission.ACCESS_FINE_LOCATION

        TextView tv = (TextView)findViewById(R.id.textView2);

        LocationManager lm = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        // 위치관리자 객체를 얻어온다

//        lm.getBestProvider(criteria, enabledOnly)
        List<String> list = lm.getAllProviders(); // 위치제공자 모두 가져오기

        String str = ""; // 출력할 문자열
        for (int i = 0; i < list.size(); i++) {
            str += "위치제공자 : " + list.get(i) + ", 사용가능여부 -"
                    + lm.isProviderEnabled(list.get(i)) +"\n";
        }
        tv.setText(str);
    } // end of onCreate
} // end of class
출처: http://bitsoul.tistory.com/130?category=623707 [Happy Programmer~]

Geocoder 주소가져오기(위도,경도 넣으면)
   public static String getCompleteAddressString(Context context, double LATITUDE, double LONGITUDE) {
        String strAdd = "";
        Geocoder geocoder = new Geocoder(context, Locale.getDefault());
        try {
            List<Address> addresses = geocoder.getFromLocation(LATITUDE, LONGITUDE, 1);
            if (addresses != null) {
                Address returnedAddress = addresses.get(0);
                StringBuilder strReturnedAddress = new StringBuilder("");


                for (int i = 0; i <= returnedAddress.getMaxAddressLineIndex(); i++) {
                    strReturnedAddress.append(returnedAddress.getAddressLine(i)).append("\n");
                }
                strAdd = strReturnedAddress.toString();
                Log.w("MyCurrentloctionaddress", strReturnedAddress.toString());
            } else {
                Log.w("MyCurrentloctionaddress", "No Address returned!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.w("MyCurrentloctionaddress", "Canont get Address!");
        }

        // "대한민국 " 글자 지워버림
        strAdd = strAdd.substring(5);

        return strAdd;
    }

```

### 공유하기
```
Intent msg = new Intent(Intent.ACTION_SEND);
msg.addCategory(Intent.CATEGORY_DEFAULT);
msg.putExtra(Intent.EXTRA_SUBJECT,"주제");
msg.putExtra(Intent.EXTRA_TEXT,"내용");
msg.putExtra(Intent.EXTRA_TITLE,"제목");
msg.setType("text/plain");
startActivity(Intent.createChooser(msg, "공유"));
```

### 전화걸기
```
<string name="data_phone">tel:1111111</string>
startActivity(new Intent("android.intent.action.CALL", Uri.parse(tel)));
startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel)));
http://mainia.tistory.com/4884
```

### 녹음,레코드(record) 권한 퍼미션
source :  
https://www.simplifiedcoding.net/audio-recording-android-example/

```
    <!--Required Permissions-->
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.RECORD_AUDIO" />
```

### 주소록에서 번호 pick하기
```
1. 버튼등 OnClickListener등에 넣어 ﻿연락처 선택 화면이 나오게 합니다.
Intent intent = new Intent(Intent.ACTION_PICK);
	 intent.setData(ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
         startActivityForResult(intent, 0);


2. 연락처 선택을 하면 결과값을 받아옵니다.
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
if(resultCode == RESULT_OK)
{
Cursor cursor = getContentResolver().query(data.getData(), 
new String[]{ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, 
ContactsContract.CommonDataKinds.Phone.NUMBER}, null, null, null);
cursor.moveToFirst();
 	                name = cursor.getString(0);        //0은 이름을 얻어옵니다.
           number = cursor.getString(1);   //1은 번호를 받아옵니다.
            cursor.close();
}
super.onActivityResult(requestCode, resultCode, data);
} 
출처: http://jhrun.tistory.com/150 [JHRunning]
```

### TextView 흐르게하기
```
txtCurrentPositionInfo = (TextView)item_fragment_tab_1_2.findViewById(R.id.item_text_1);
txtCurrentPositionInfo.setSelected(true);

android:ellipsize="marquee"
android:singleLine="true"
	    
```


### build 시간 줄이기  
http://gun0912.tistory.com/76

### 같은코드 서로 다른 앱 만들기  
http://gun0912.tistory.com/74

### Flavor 공식문서  
https://developer.android.com/studio/build/build-variants

### Log  

```
Log.v(); // Verbose
Log.d(); // Debug
Log.i(); // Info
Log.w(); // Warning
Log.e(); // Error

// 개발이 끝나고 난뒤 log값만 주석처리하면됨
public static void showLogDebug(String tag, String msg) {
    android.util.Log.d(tag, msg);
}

```

### ToggleButton
```
        <ToggleButton
            android:gravity="center"
            android:id="@+id/item_text_2"
            android:layout_alignParentRight="true"
            android:layout_centerVertical="true"
            android:padding="5dp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginRight="10dp"
            android:textOff="현재위치"
            android:textOn="현재위치"
            android:textColorHint="@color/gray"
            android:textColor="@color/gray"
            android:textSize="@dimen/text_small"
            android:drawableLeft="@drawable/ic_my_location_gray"
            android:background="@drawable/rounded_border_edittext"
            />
```


### AsyncTask

```
// 각 상속 메소드별 return형과 매개변수는 
// paramsType(doInBackground), progress, returnType(doInBackground)
public class async_url_list extends AsyncTask<List<String> , Integer, List<String>>


① onPreExecute()
AsyncTask의 작업은 메인 스레드에서 MyAsyncTask.execute(); 이런 식으로 실행시키는데 이 코드가 실행되면 작업 전에 제일 먼저 onPreExecute() 메서드가 호출된다. 본격적인 작업에 앞서 준비 작업을 진행하는 곳이라고 보면 된다. 

② doInBackground()
메인 작업이 실행되는 곳. 이곳에서 실행된 결괏값은 result에 담아 리턴했다.

③ onProgressUpdate()
doInBackground() 작업 도중 publishProgress()를 호출하면 onPressUpdate() 가 실행된다.
사용자에게 진행 상황을 알릴 때 사용된다. (ex. Toast 메시지 : "현재 진행 중입니다.")

④ onPostExecute()
doInBackground()에서 리턴 한 값을 전달받아서 매개변수로 사용한다.
넘겨받은 result를 통해 UI 변경 작업을 진행한다.(ex setText(result))...
[출처] AsyncTask 사용하기|작성자 스제
```
