class ResourceRunner {
    public static void main(String[] args) {
       
        Resource serverRoom = new Resource();

        
        serverRoom.allocate();
        serverRoom.reserve();
        serverRoom.checkAvailability();
        serverRoom.lock();
        serverRoom.trackUsage();
        serverRoom.updateStatus();
        serverRoom.validatePermissions();
        serverRoom.assignOwner();
        serverRoom.renew();
        serverRoom.notifyUser();
        serverRoom.repair();
        serverRoom.unlock();
        serverRoom.cancelReservation();
        serverRoom.deallocate();
        serverRoom.decommission();

     

        
        Resource.getSystemCapacity();
        Resource.setGlobalAccessPolicy();
        Resource.listResourceTypes();
        Resource.calculateUtilizationRate();
        Resource.displayEmergencyProtocol();
    }
}