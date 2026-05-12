 class RideFare{
     double distance;
     int timeOfDay;
     boolean isSurgePricing;
     int waitingMinutes;

     RideFare(double distance, int timeOfDay, boolean isSurgePricing, int waitingMinutes) {
        this.distance = distance;
        this.timeOfDay = timeOfDay;
        this.isSurgePricing = isSurgePricing;
        this.waitingMinutes = waitingMinutes;
    }

     double calculateBaseFare() {
        double baseFare;
        if (this.distance <= 2) {
            baseFare = 5.0;
        } else {
            baseFare = 5.0 + (this.distance - 2) * 1.5;
        }
        return baseFare;
    }

     double applyTimeSurcharge(double baseFare) {
       double totalWithSurcharge = baseFare;
        
        if (this.timeOfDay >= 23 || this.timeOfDay < 5) {
            totalWithSurcharge += baseFare * 0.25;
        } 
       
        else if ((this.timeOfDay >= 7 && this.timeOfDay <= 9) || (this.timeOfDay >= 17 && this.timeOfDay <= 19)) {
            totalWithSurcharge += baseFare * 0.15;
        }
        return totalWithSurcharge;
    }

     double applyWaitingCharges(double fareAfterTime) {
        double totalWaitingCharge = 0;
      
        for (int i = 1; i <= this.waitingMinutes; i++) {
            if (i > 2) {
                totalWaitingCharge += 0.50;
            }
        }
        return fareAfterTime + totalWaitingCharge;
    }

     double calculateFinalFare() {
        double fare = calculateBaseFare();
        fare = applyTimeSurcharge(fare);
        fare = applyWaitingCharges(fare);

        if (this.isSurgePricing) {
            fare *= 1.5;
        }

      
        return Math.round(fare * 100.0) / 100.0;
    }
}