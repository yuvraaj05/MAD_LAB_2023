public class MainActivity extends AppCompatActivity {

    private Button clickButton;
    private TextView messageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickButton = findViewById(R.id.click_button);
        messageText = findViewById(R.id.message_text);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = messageText.getText().toString();

                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        messageText.setText("");
                    }
                }, 2000);
            }
        });
    }
}
