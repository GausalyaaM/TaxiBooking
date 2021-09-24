package com.company.taxi;

public class Booking {
        private int customerId;
        private char pickupPoint;
        private char dropPoint;
        private int pickupTime;

        public int getCustomerId(int customerId) {
            return this.customerId;
        }

        public void setCustomerId(int customerId) {
            this.customerId = customerId;
        }

        public char getPickupPoint() {
            return pickupPoint;
        }

        public void setPickupPoint(char pickupPoint) {
            this.pickupPoint = pickupPoint;
        }

        public char getDropPoint() {
            return dropPoint;
        }

        public void setDropPoint(char dropPoint) {
            this.dropPoint = dropPoint;
        }

        public int getPickupTime() {
            return pickupTime;
        }

        public void setPickupTime(int pickupTime) {
            this.pickupTime = pickupTime;
        }
    }
