package com.github.saboteur.ticketbookingsystem.ticketbookingservice.model.booking

import com.github.saboteur.ticketbookingsystem.ticketbookingservice.domain.BookingOperation

class BookingResult {
    var clientId: Long = -1L
    var sessionId: Long = -1L
    var bookedTicket: BookedTicket? = null
    var operation: BookingOperation = BookingOperation.UNKNOWN
    var resultMsg: String = ""
}