package HW5.com.model.vehicle;

  public abstract class Car {
      private String model;
      private int maxSpeed;
      private int yearOfManufacture;

      public Car(String model, int maxSpeed, int yearOfManufacture) {
          this.model = model;
          this.maxSpeed = maxSpeed;
          this.yearOfManufacture = yearOfManufacture;
      }

      public String getModel() {
          return model;
      }

      public void setModel(String model) {
          this.model = model;
      }

      public int getMaxSpeed() {
          return maxSpeed;
      }

      public void setMaxSpeed(int maxSpeed) {
          this.maxSpeed = maxSpeed;
      }

      public int getYearOfManufacture() {
          return yearOfManufacture;
      }

      public void setYearOfManufacture(int yearOfManufacture) {
          this.yearOfManufacture = yearOfManufacture;
      }

      @Override
      public String toString() {
          return "Car{" +
                  "model='" + model + '\'' +
                  ", maxSpeed=" + maxSpeed +
                  ", yearOfManufacture=" + yearOfManufacture +
                  '}';
      }
       public abstract void run();
       public abstract void stop();

      public Car() {
      }
  }
