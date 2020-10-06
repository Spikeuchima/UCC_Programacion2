Proceso Algebrin_Dividin
	Definir Algebrin,Dividin,Pedazoscu,Moro Como Entero;
	Definir Panalgebrin,Pandividin,saldoalgebrin,saldodividin Como Entero;
	Definir Oroalgebrin,Orodividin Como Entero;
	Algebrin<-5;
	Dividin<-3;
	Pedazoscu<-8;
	Moro<-8;
	//Algebrin tenia 5 panes y dividin tenia 3
	//el oro que ofrecio el rico eran 8 monedas de oro
	Panalgebrin=Algebrin*3;
	Pandividin=Dividin*3;
	//El pan de cada uno se multiplica por 3 que son los tres
	//los pedazos que les corresponde a cada uno es 8
	//ya que el total de panes es 24 y dividido por 3 da 8
	saldoalgebrin=Panalgebrin-Pedazoscu;
	saldodividin=Pandividin-Pedazoscu;
	//De los 15 panes algebrin consume 8 y deja 5
	//de los 9 panes dividin come 8 y deja 1
	Oroalgebrin=Moro-saldodividin;
	Orodividin=saldodividin;
	//Por ende a algebrin le corresponde 8 monedas de oro y a dividin 1
	Escribir "A Algebrin le corresponde ", Oroalgebrin, " de oro";
	Escribir "Porque dio ", saldoalgebrin ," panes";
	Escribir "A Dividin le corresponde ", Orodividin, " de oro";
	Escribir "Porque dio ", saldodividin ," panes";
FinProceso