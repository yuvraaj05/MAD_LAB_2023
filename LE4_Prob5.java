public class MainActivity extends AppCompatActivity {

    private EditText dollarEditText;
    private TextView resultTextView;

    private static final double CONVERSION_RATE = 74.69;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dollarEditText = findViewById(R.id.dollar_edit_text);
        resultTextView = findViewById(R.id.result_text_view);

        Button convertButton = findViewById(R.id.convert_button);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dollarStr = dollarEditText.getText().toString();
                double dollarDouble = Double.parseDouble(dollarStr);
                double inrDouble = dollarDouble * CONVERSION_RATE;
                String inrStr = String.format("%.2f", inrDouble);
                String resultStr = "Amount in INR: Rs. " + inrStr;
                resultTextView.setText(resultStr);
                Toast.makeText(MainActivity.this, resultStr, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
