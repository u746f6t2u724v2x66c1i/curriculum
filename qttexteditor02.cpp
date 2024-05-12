#include <QtWidgets/QApplication>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QTextEdit>
#include <QtWidgets/QToolBar>
#include <QGuiApplication>
#include <QtWidgets/QFileDialog>
#include <QtGui/QClipboard>
#include <QtCore/QFile>
#include <QAction>
#include <QFont>

void saveText(QTextEdit *textEdit) {
  QString text = textEdit->toPlainText();
  if (text.isEmpty()) {
    qDebug() << "Failed to get text from QTextEdit";
    return;
  }

  QString filename = QFileDialog::getSaveFileName(nullptr, "Save File");
  if (filename.isEmpty()) {
    return;
  }

  QFile file(filename);
  if (!file.open(QIODevice::WriteOnly)) {
    qDebug() << "Failed to open file for writing: " << filename;
    return;
  }

  QTextStream out(&file);
  out << text;

  file.close();
}

void openText(QTextEdit *textEdit) {
  QString filename = QFileDialog::getOpenFileName(nullptr, "Open File");
  if (filename.isEmpty()) {
    return;
  }

  QFile file(filename);
  if (!file.open(QIODevice::ReadOnly)) {
    qDebug() << "Failed to open file for reading: " << filename;
    return;
  }

  QTextStream in(&file);
  QString content = in.readAll();

  textEdit->setPlainText(content);

  file.close();
}

int fontSize = 16;

int main(int argc, char *argv[]) {
  QApplication app(argc, argv);

  QMainWindow window;
  window.setWindowTitle("Qt Text Editor");
  window.resize(800, 600);

  QTextEdit *textEdit = new QTextEdit;
  window.setCentralWidget(textEdit);

  QToolBar *toolBar = window.addToolBar("Toolbar");

  QAction *copyAction = toolBar->addAction("Copy");
  QObject::connect(copyAction, &QAction::triggered, textEdit, &QTextEdit::copy);

  QAction *pasteAction = toolBar->addAction("Paste");
  QObject::connect(pasteAction, &QAction::triggered, textEdit, &QTextEdit::paste);

  QAction *saveAction = toolBar->addAction("Save");
  QObject::connect(saveAction, &QAction::triggered, [=](){
        QString text = textEdit->toPlainText();
        if (text.isEmpty()) {
            qDebug() << "Failed to get text from QTextEdit";
            return;
        }

        // Open file dialog
        QString filename = QFileDialog::getSaveFileName(nullptr, "Save File");
        if (filename.isEmpty()) {
            return;
        }

        // Open file for writing
        QFile file(filename);
        if (!file.open(QIODevice::WriteOnly)) {
            qDebug() << "Failed to open file for writing: " << filename;
            return;
        }

        // Write text content to file
        QTextStream out(&file);
        out << text;

        file.close();
    });

    QAction *openAction = toolBar->addAction("Open");
    QObject::connect(openAction, &QAction::triggered, [=](){
        // Open file dialog
        QString filename = QFileDialog::getOpenFileName(nullptr, "Open File");
        if (filename.isEmpty()) {
            return;
        }

        // Open file for reading
        QFile file(filename);
        if (!file.open(QIODevice::ReadOnly)) {
            qDebug() << "Failed to open file for reading: " << filename;
            return;
        }

        // Read file content
        QTextStream in(&file);
        QString content = in.readAll();

        // Insert text content to QTextEdit
        textEdit->setPlainText(content);

        file.close();
    });

    QAction *increaseFontSizeAction = toolBar->addAction("+");
    QObject::connect(increaseFontSizeAction, &QAction::triggered, [=](){
        fontSize++;
        QFont font = textEdit->font();
        font.setPointSize(fontSize);
        textEdit->setFont(font);
    });

    QAction *decreaseFontSizeAction = toolBar->addAction("-");
    QObject::connect(decreaseFontSizeAction, &QAction::triggered, [=](){
        fontSize--;
        QFont font = textEdit->font();
        font.setPointSize(fontSize);
        textEdit->setFont(font);
    });

    window.show();

    return app.exec();
}
