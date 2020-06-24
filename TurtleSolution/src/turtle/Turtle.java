package turtle;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Turtle {
	private Pen turtlePen;
	private int xCoordinate;
	private int yCoordinate;
	private Compass direction = Compass.EAST;
	
	public int getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public int getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	public Pen getTurtlePen() {
		return turtlePen;
	}
	public void setTurtlePen(Pen turtlePen) {
		this.turtlePen = turtlePen;
	}
	
	public Compass getDirection() {
		return direction;
	}
	public void setDirection(Compass direction) {
		this.direction = direction;
	}
	
	public void moveForward(int numberOfSteps, int[][] canvas) throws TurtleException {		
		if(this.getDirection() == Compass.EAST) {
			for(int i = yCoordinate; i < BigDecimal.ONE.intValue(); i++) {
				for(int j = xCoordinate; j < numberOfSteps; j++) {
					canvas[i][j] = BigDecimal.ONE.intValue();
				}
			}
			this.xCoordinate += numberOfSteps - 1;
		}else if(this.getDirection() == Compass.SOUTH) {
			for(int i = yCoordinate; i < numberOfSteps; i++) {
				canvas[i][xCoordinate] = BigDecimal.ONE.intValue();
			}
			this.yCoordinate += numberOfSteps - 1;
		}else if(this.getDirection() == Compass.WEST) {
			for(int i = yCoordinate; i <= yCoordinate; i++) {
				for(int j = xCoordinate; j >= BigDecimal.ZERO.intValue(); j--) {
					canvas[i][j] = BigDecimal.ONE.intValue();
				}
			}
			this.xCoordinate -= numberOfSteps - 1;
		}else if(this.getDirection() == Compass.NORTH) {
			for(int i = yCoordinate; i >= BigDecimal.ZERO.intValue(); i--) {
				canvas[i][xCoordinate] = BigDecimal.ONE.intValue();
			}
			this.yCoordinate -= numberOfSteps - 1;
		}
		
	}
	
	public void turnRight() throws TurtleException {
		if(this.getDirection() == null) {
			throw new TurtleException("Turtle compass is currently null");
		}
		if(this.getDirection() == Compass.EAST) {
			this.setDirection(Compass.SOUTH);
		}else if(this.getDirection() == Compass.SOUTH) {
			this.setDirection(Compass.WEST);
		}else if(this.getDirection() == Compass.WEST) {
			this.setDirection(Compass.NORTH);
		}else if(this.getDirection() == Compass.NORTH){
			this.setDirection(Compass.EAST);
		}
	}
	
	public boolean isValidNumberOfSteps(int numberOfSteps, int floorSize) throws TurtleException {
		boolean result = true;
		//this.isValidNumberOfSteps(numberOfSteps, canvas.length) {};
		if(numberOfSteps < BigInteger.ONE.intValue()) {
			throw new TurtleException("Number of steps have to be more than zero");
		} else if(getDirection() == Compass.EAST && (numberOfSteps + this.getxCoordinate()) > floorSize) {
			throw new TurtleException(numberOfSteps + " steps will put turtle out of bounds");
		} else if(getDirection() == Compass.WEST && (this.getxCoordinate() - numberOfSteps) < 0) {
			throw new TurtleException("Number of steps have to be more than zero");
		} else if(getDirection() == Compass.NORTH && (this.getyCoordinate() - numberOfSteps < 0)) {
			throw new TurtleException(numberOfSteps + " steps will put turtle out of bounds");
		} else if(getDirection() == Compass.SOUTH && (this.getyCoordinate() + numberOfSteps > floorSize)) {
			throw new TurtleException(numberOfSteps + " steps will put turtle out of bounds");
		}
		
		return result;
	}
	
	public void turnLeft() throws TurtleException {
		if(this.getDirection() == null) {
			throw new TurtleException("Turtle is in an invalid location");
		}
		if(this.getDirection() == Compass.EAST) {
			this.setDirection(Compass.NORTH);
		} else if(this.getDirection() == Compass.NORTH) {
			this.setDirection(Compass.WEST);
		} else if(this.getDirection() == Compass.WEST) {
			this.setDirection(Compass.SOUTH);
		}else if(this.getDirection() == Compass.SOUTH) {
			this.setDirection(Compass.EAST);
		}
		
	}
}
