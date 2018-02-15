class X{
    int j = -100;

/**
    Caso o valor do construtor seja maior que 1 , a variavel j continua com o seu valor de -100
    caso contrário (x seja menor que 1) a variavel j recebe o valor de x vindo do construtor;
 */
    X(int x){
        if(x > 1)
        return;
        j = i;
    }
}