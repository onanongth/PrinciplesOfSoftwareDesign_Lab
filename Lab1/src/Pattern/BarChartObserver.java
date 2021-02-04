package Pattern;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
 
import javax.swing.JPanel;
 
/**
 * This class represents a bar chart view of a vector of data. Uses the Observer
 * pattern.
 */
@SuppressWarnings("serial")
public class BarChartObserver extends JPanel implements Observer {
	/**
	 * Creates a BarChartObserver object
	 * 
	 * @param data
	 *            a CourseData object to observe
	 */
	public BarChartObserver(CourseData data) {
		data.attach(this);
		this.courseData = data.getUpdate();
		this.setPreferredSize(new Dimension(2 * LayoutConstants.xOffset
				+ (LayoutConstants.barSpacing + LayoutConstants.barWidth)
				* this.courseData.size(), LayoutConstants.graphHeight + 2
				* LayoutConstants.yOffset));
		this.setBackground(Color.white);
	}

	/**
	 * Paint method
	 * 
	 * @param g
	 *            a Graphics object on which to paint
	 */
	public void paint(Graphics g) {
		super.paint(g);
		int radius = 100;
		ArrayList<CourseRecord> sliders;
		//LayoutConstants.paintBarChartOutline(g, this.courseData.size());
		for (int i = 0; i < courseData.size(); i++) {
			double startAngle = 0.0;
			CourseRecord record = (CourseRecord) courseData.get(i);
			double ratio = (record.getNumOfStudents() / 100.0) * 360.0;
			g.setColor(LayoutConstants.courseColours[i%LayoutConstants.courseColours.length]); 
			//g.setColor(Color.blue);
			g.fillArc(
					LayoutConstants.xOffset + (i + 1)
					* LayoutConstants.barSpacing + i
					* LayoutConstants.barWidth, LayoutConstants.yOffset,
					radius, radius,
					(int) startAngle, (int) ratio);
			g.setColor(Color.red);
			g.drawString(record.getName(),
					LayoutConstants.xOffset + (i + 1)
							* LayoutConstants.barSpacing + i
							* LayoutConstants.barWidth, LayoutConstants.yOffset
							+ LayoutConstants.graphHeight + 20);
			startAngle += ratio;
		}
	}

	/**
	 * Informs this observer that the observed CourseData object has changed
	 * 
	 * @param o
	 *            the observed CourseData object that has changed
	 */
	public void update(Observable o) {
		CourseData data = (CourseData) o;
		this.courseData = data.getUpdate();

		this.setPreferredSize(new Dimension(2 * LayoutConstants.xOffset
				+ (LayoutConstants.barSpacing + LayoutConstants.barWidth)
				* this.courseData.size(), LayoutConstants.graphHeight + 2
				* LayoutConstants.yOffset));
		this.revalidate();
		this.repaint();
	}

	private ArrayList<CourseRecord> courseData;
}