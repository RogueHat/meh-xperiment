#include <QApplication>
#include <QLabel>

int main(int argc, char* argv[]) {
	QApplication app(argc, argv);
	QLabel* label = new QLabel("Hello Qt!");
	label->resize(80,30);
	label->show();
	return app.exec();
}
