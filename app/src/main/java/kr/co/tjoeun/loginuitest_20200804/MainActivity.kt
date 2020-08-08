package kr.co.tjoeun.loginuitest_20200804

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //로그인 버튼이 눌렸을 때 -> 검사수행
        loginBtn.setOnClickListener {

            // 아이디에 입력된 값(코틀린에서 xml 속성 접근) / 비번에 입력된 값 저장(변수)
            var inputId = idEdt.text.toString();
            var inputPw = pwEdt.text.toString();

            if(inputId == "admin@test.com" && inputPw =="qwer")
            {
                // 로그인 성공
                Toast.makeText(this,"관리자입니다.", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_LONG).show()

            }


        }
    }
}