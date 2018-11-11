# manual-android
android for me

### Reference
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

### 실시간 시간 받아오기
```
long time = System.currentTimeMillis();
SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
String str = dayTime.format(new Date(time));
//: http://ra2kstar.tistory.com/123 [초보개발자 이야기.]
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

### 색깔 소스
getResources().getColor(R.color.white)  

### Edittext focuse 해제
```
android:focusable="true"
 android:focusableInTouchMode="true"
출처: http://gogorchg.tistory.com/entry/Android-EditText-자동-포커스-제거 [항상 초심으로]
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
