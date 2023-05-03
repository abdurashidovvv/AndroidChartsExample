package uz.abdurashidov.androidchartsexample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidplot.pie.Segment
import com.androidplot.pie.SegmentFormatter
import uz.abdurashidov.androidchartsexample.databinding.ActivityPieChartBinding

class PieChartActivity : AppCompatActivity() {
    private val binding by lazy { ActivityPieChartBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val s1 = Segment("S1", 23)
        val s2 = Segment("S1", 44)
        val s3 = Segment("S1", 55)
        val s4 = Segment("S1", 32)

        val sf1 = SegmentFormatter(Color.BLUE)
        val sf2 = SegmentFormatter(Color.YELLOW)
        val sf3 = SegmentFormatter(Color.CYAN)
        val sf4 = SegmentFormatter(Color.MAGENTA)

        binding.pieChart.addSegment(s1,sf1)
        binding.pieChart.addSegment(s2,sf2)
        binding.pieChart.addSegment(s3,sf3)
        binding.pieChart.addSegment(s4,sf4)
    }
}