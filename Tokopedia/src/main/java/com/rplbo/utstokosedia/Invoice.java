package com.rplbo.utstokosedia;

public class Invoice {
    int jumlah;
    long tagihan;
    Produk produk;
    Member member;

    public void buatInvoice(Produk p1, int i, Member inputmember) {
        produk = p1;
        jumlah = i;
        member = inputmember;

    }

    public void printInvoice() {
    }

    public Object getTagihan() {
        return null;
    }
}
