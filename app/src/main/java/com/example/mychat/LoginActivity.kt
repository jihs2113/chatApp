package com.example.mychat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mychat.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding
    //gradle 설정에 뷰바인딩 true로 설정하여 약어 입력 시 클래스들을 불러올수있다.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        //객체 초기화
        //setContentView(R.layout.activity_login)
        setContentView(binding.root)

        //val signUpBtn: Button = findViewId(R.id.signUp_btn)
        //버튼에 접근하려면 객체를 이렇게 만들어줘야했는데 뷰바인딩 설정을 해줌으로 생략 가능하다.

        //회원가입 버튼 이벤트
        binding.signUpBtn.setOnClickListener {
            //객체에 바로 접근하여 이벤트를 만들어준다.
            val intent: Intent = Intent(this@LoginActivity, SignUpActivity::class.java)
            //컨텍스트와 이동할 클래스 설정
            //Intent(현재 액티비티 , 이동할 액티비티)
            startActivity(intent)

        }
    }
}