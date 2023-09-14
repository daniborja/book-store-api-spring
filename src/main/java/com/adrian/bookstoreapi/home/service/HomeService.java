package com.adrian.bookstoreapi.home.service;

import com.adrian.bookstoreapi.home.dto.BookHomeResponseDto;
import com.adrian.bookstoreapi.home.dto.PaginatedBooksHomeResponseDto;
import com.adrian.bookstoreapi.home.dto.PaymentOrderRequestDto;
import com.adrian.bookstoreapi.payments.dto.PayPalOrderResponseDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface HomeService {

    PaginatedBooksHomeResponseDto findAllBooks(Pageable pageable);

    BookHomeResponseDto findOneBookBySlug(String slug);

    List<BookHomeResponseDto> findLatestBooks();

    PayPalOrderResponseDto createPaymentOrder(PaymentOrderRequestDto paymentOrderRequestDto);
}
