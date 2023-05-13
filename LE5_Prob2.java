public class MainActivity extends AppCompatActivity {

    private ImageView modiImageView;
    private ImageView rahulImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modiImageView = findViewById(R.id.modi_image_view);
        rahulImageView = findViewById(R.id.rahul_image_view);

        modiImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modiImageView.setVisibility(View.INVISIBLE);
                rahulImageView.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        rahulImageView.setVisibility(View.INVISIBLE);
                        modiImageView.setVisibility(View.VISIBLE);
                    }
                }, 2000);
            }
        });

        rahulImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rahulImageView.setVisibility(View.INVISIBLE);
                modiImageView.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        modiImageView.setVisibility(View.INVISIBLE);
                        rahulImageView.setVisibility(View.VISIBLE);
                    }
                }, 2000);
            }
        });
    }
}
