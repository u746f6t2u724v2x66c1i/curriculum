#include <gtk/gtk.h>

static void copy_text(GtkWidget *widget, gpointer entry) {
    GtkClipboard *clipboard = gtk_clipboard_get(GDK_SELECTION_CLIPBOARD);
    gtk_clipboard_set_text(clipboard, gtk_entry_get_text(GTK_ENTRY(entry)), -1);
}

static void paste_text(GtkWidget *widget, gpointer entry) {
    GtkClipboard *clipboard = gtk_clipboard_get(GDK_SELECTION_CLIPBOARD);
    gchar *text = gtk_clipboard_wait_for_text(clipboard);
    gtk_entry_set_text(GTK_ENTRY(entry), text);
    g_free(text);
}

static void save_text(GtkWidget *widget, gpointer entry) {
    const gchar *filename;
    GtkWidget *dialog;
    GtkWidget *window = gtk_widget_get_toplevel(widget);

    dialog = gtk_file_chooser_dialog_new("Save File", GTK_WINDOW(window), GTK_FILE_CHOOSER_ACTION_SAVE, "_Cancel", GTK_RESPONSE_CANCEL, "_Save", GTK_RESPONSE_ACCEPT, NULL);
    gtk_file_chooser_set_do_overwrite_confirmation(GTK_FILE_CHOOSER(dialog), TRUE);

    if (gtk_dialog_run(GTK_DIALOG(dialog)) == GTK_RESPONSE_ACCEPT) {
        filename = gtk_file_chooser_get_filename(GTK_FILE_CHOOSER(dialog));
        FILE *file = fopen(filename, "w");
        if (file != NULL) {
            fprintf(file, "%s", gtk_entry_get_text(GTK_ENTRY(entry)));
            fclose(file);
        }
        g_free((gpointer)filename);
    }

    gtk_widget_destroy(dialog);
}

int main(int argc, char *argv[]) {
    GtkWidget *window;
    GtkWidget *entry;
    GtkWidget *button_copy;
    GtkWidget *button_paste;
    GtkWidget *button_save;
    GtkWidget *box;
    GtkWidget *grid;

    gtk_init(&argc, &argv);

    window = gtk_window_new(GTK_WINDOW_TOPLEVEL);
    g_signal_connect(window, "destroy", G_CALLBACK(gtk_main_quit), NULL);
    gtk_container_set_border_width(GTK_CONTAINER(window), 10);

    box = gtk_box_new(GTK_ORIENTATION_VERTICAL, 5);
    gtk_container_add(GTK_CONTAINER(window), box);

    entry = gtk_entry_new();
    gtk_entry_set_width_chars(GTK_ENTRY(entry), 90); // 横のサイズを広げる
    gtk_widget_set_size_request(entry, -1, 600); // 高さを200に設定する
    gtk_entry_set_alignment(GTK_ENTRY(entry), 0); // カーソルを左寄せにする
    gtk_editable_set_position(GTK_EDITABLE(entry), 0); // カーソルを上端に配置する
    gtk_box_pack_start(GTK_BOX(box), entry, FALSE, FALSE, 0); // 拡大しない

    grid = gtk_grid_new();
    gtk_box_pack_start(GTK_BOX(box), grid, FALSE, FALSE, 0); // 拡大しない

    button_copy = gtk_button_new_with_label("Copy");
    g_signal_connect(button_copy, "clicked", G_CALLBACK(copy_text), entry);
    gtk_grid_attach(GTK_GRID(grid), button_copy, 0, 0, 1, 1);

    button_paste = gtk_button_new_with_label("Paste");
    g_signal_connect(button_paste, "clicked", G_CALLBACK(paste_text), entry);
    gtk_grid_attach(GTK_GRID(grid), button_paste, 1, 0, 1, 1);

    button_save = gtk_button_new_with_label("Save");
    g_signal_connect(button_save, "clicked", G_CALLBACK(save_text), entry);
    gtk_grid_attach(GTK_GRID(grid), button_save, 2, 0, 1, 1);

    gtk_widget_show_all(window);

    gtk_main();

    return 0;
}

