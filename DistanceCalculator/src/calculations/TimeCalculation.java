package calculations;

import domain.Coordinates;
import domain.TravelTime;
import units.DifferentUnitTravelTime;

public class TimeCalculation {
	public int unitSpeed;
	public int hour;
	public int minutes;
	public int seconds;

	public TimeCalculation(int unitSpeed) {
		this.unitSpeed = unitSpeed;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	public int getUnitSpeed() {
		return unitSpeed;
	}

	public void setUnitSpeed(int unitSpeed) {
		this.unitSpeed = unitSpeed;
	}

	public void time() {
		double distance = DistanceCalculation.distance;
		seconds = (int) (distance * unitSpeed);
		minutes = seconds/60;
		seconds = seconds%60;
		hour = minutes/60;
		minutes = minutes%60;
		TravelTime time = TravelTime.getInstance();
		if (seconds< 10) {
			time.setTime(hour+":"+minutes+":0"+seconds);
			if (minutes<10) {
				time.setTime(hour+":0"+minutes+":0"+seconds);
			}
			else {
				time.setTime(hour+":"+minutes+":0"+seconds);
			}
		}
		else {
			time.setTime(hour+":"+minutes+":"+seconds);
			if (minutes<10) {
				time.setTime(hour+":0"+minutes+":"+seconds);
			}
			else {
				time.setTime(hour+":"+minutes+":"+seconds);
			}
		}
	}

	@Override
	public String toString() {
		return "timeCalculation [hour=" + hour + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}

	public static void main(String[] args) {
		Coordinates a = new Coordinates(452, 522);
		Coordinates b = new Coordinates(456, 523);
		DistanceCalculation distance1 = new DistanceCalculation(a, b);
		distance1.distanceCalculator();
		TimeCalculation t = new TimeCalculation(0);
		DifferentUnitTravelTime speed = new DifferentUnitTravelTime();
		t.setUnitSpeed(speed.getRamCatapult());
		t.time();
		TravelTime time = TravelTime.getInstance();
		System.out.println(time.getTime());
	}

}
