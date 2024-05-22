#include <QApplication>
#include <QMainWindow>
#include <QTextEdit>
#include <QAction>
#include <QFileDialog>
#include <QFile>
#include <QTextStream>
#include <QDebug>
#include <QMenuBar>
#include <QFontDialog>
#include <QColorDialog>

void saveText(QTextEdit* textEdit) {
    QString text = textEdit->toPlainText();
    if (text.isEmpty()) {
        qDebug() << "Failed to get text from QTextEdit";
        return;
    }

    QString filename = QFileDialog::getSaveFileName(nullptr, "Save Text", "", "Text Files (*.txt);;All Files (*)");
    if (filename.isEmpty()) {
        return;
    }

    QFile file(filename);
    if (!file.open(QIODevice::WriteOnly | QIODevice::Text)) {
        qDebug() << "Failed to open file for writing: " << filename;
        return;
    }

    QTextStream out(&file);
    out << text;
    file.close();
}

void openText(QTextEdit* textEdit) {
    QString filename = QFileDialog::getOpenFileName(nullptr, "Open Text", "", "Text Files (*.txt);;All Files (*)");
    if (filename.isEmpty()) {
        return;
    }

    QFile file(filename);
    if (!file.open(QIODevice::ReadOnly | QIODevice::Text)) {
        qDebug() << "Failed to open file for reading: " << filename;
        return;
    }

    QTextStream in(&file);
    QString text = in.readAll();
    textEdit->setPlainText(text);
    file.close();
}

void changeFont(QTextEdit* textEdit) {
    bool ok;
    QFont font = QFontDialog::getFont(&ok, textEdit->font());
    if (ok) {
        textEdit->setFont(font);
    }
}

void changeBackgroundColor(QTextEdit* textEdit) {
    QColor color = QColorDialog::getColor(textEdit->palette().base().color());
    if (color.isValid()) {
        QPalette palette = textEdit->palette();
        palette.setColor(QPalette::Base, color);
        textEdit->setPalette(palette);
    }
}

int main(int argc, char *argv[]) {
    QApplication app(argc, argv);

    QMainWindow mainWindow;
    mainWindow.setWindowTitle("QApptextEd003");
    mainWindow.resize(800, 600);

    QTextEdit* textEdit = new QTextEdit(&mainWindow);
    mainWindow.setCentralWidget(textEdit);

    QMenuBar *menuBar = mainWindow.menuBar();
    QMenu *fileMenu = menuBar->addMenu("File");
    QMenu *editMenu = menuBar->addMenu("Edit");
    QMenu *viewMenu = menuBar->addMenu("View");

    QAction* saveAction = new QAction("Save", &mainWindow);
    QAction* openAction = new QAction("Open", &mainWindow);
    QAction* changeFontAction = new QAction("Change Font", &mainWindow);
    QAction* changeBackgroundColorAction = new QAction("Change Background Color", &mainWindow);

    QObject::connect(saveAction, &QAction::triggered, [=]() { saveText(textEdit); });
    QObject::connect(openAction, &QAction::triggered, [=]() { openText(textEdit); });
    QObject::connect(changeFontAction, &QAction::triggered, [=]() { changeFont(textEdit); });
    QObject::connect(changeBackgroundColorAction, &QAction::triggered, [=]() { changeBackgroundColor(textEdit); });

    fileMenu->addAction(openAction);
    fileMenu->addAction(saveAction);
    editMenu->addAction(changeFontAction);
    viewMenu->addAction(changeBackgroundColorAction);

    mainWindow.show();
    return app.exec();
}

