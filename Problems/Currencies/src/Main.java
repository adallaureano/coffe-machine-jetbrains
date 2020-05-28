
enum Currency {
    USD(1, "United States dollar"),
    EUR(2, "Euro"),
    GBP(2, "Pound sterling"),
    RUB(1, "Russian ruble"),
    UAH(1, "Ukrainian hryvnia"),
    KZT(2, "Kazakhstani tenge"),
    CAD(2, "Canadian dollar"),
    JPY(2, "Japanese yen"),
    CNY(1, "Chinese yuan");

    int number;
    String fullName;

    Currency(int number, String fullName) {
        this.number = number;
        this.fullName = fullName;
    }
}