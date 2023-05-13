public class MainActivity extends AppCompatActivity {

    private ImageView superheroImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        superheroImageView = findViewById(R.id.superhero_image_view);

        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fadeIn.setDuration(2000);
        superheroImageView.startAnimation(fadeIn);

        Animation scaleUp = AnimationUtils.loadAnimation(this, R.anim.scale_up);
        scaleUp.setDuration(2000);
        superheroImageView.startAnimation(scaleUp);

        Animation translateRight = AnimationUtils.loadAnimation(this, R.anim.translate_right);
        translateRight.setDuration(2000);
        superheroImageView.startAnimation(translateRight);

        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        rotate.setDuration(2000);
        superheroImageView.startAnimation(rotate);
    }
}
