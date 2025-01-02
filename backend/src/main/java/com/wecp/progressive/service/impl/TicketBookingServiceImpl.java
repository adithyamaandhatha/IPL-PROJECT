package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.TicketBooking;
import com.wecp.progressive.service.TicketBookingService;

public class TicketBookingServiceImpl implements TicketBookingService  {

    @Override
    public List<TicketBooking> getAllTicketBookings() {
        // TODO Auto-generated method stub
        return new ArrayList<>();
    }

    @Override
    public int createBooking(TicketBooking ticketBooking) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public void cancelBooking(int bookingId) {
        // TODO Auto-generated method stub
    }

    @Override
    public List<TicketBooking> getBookingsByUserEmail(String email) {
        // TODO Auto-generated method stub
        return new ArrayList();
    }

}