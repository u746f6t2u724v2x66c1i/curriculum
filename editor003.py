import tkinter as tk
from tkinter import filedialog
from tkinter import messagebox

def open_file():
    file_path = filedialog.askopenfilename()
    if file_path:
        with open(file_path, 'r') as file:
            editor_text.delete(1.0, tk.END)
            editor_text.insert(tk.END, file.read())

def save_file():
    file_path = filedialog.asksaveasfilename(defaultextension=".txt")
    if file_path:
        with open(file_path, 'w') as file:
            file.write(editor_text.get(1.0, tk.END))
        messagebox.showinfo("Save", "File saved successfully.")

def copy_text():
    editor_text.clipboard_clear()
    editor_text.clipboard_append(editor_text.selection_get())

def cut_text():
    copy_text()
    editor_text.delete("sel.first", "sel.last")

def paste_text():
    editor_text.insert(tk.INSERT, editor_text.clipboard_get())

# Create main window
root = tk.Tk()
root.title("Simple Text Editor")

# Create text editor
editor_text = tk.Text(root)
editor_text.pack(expand=True, fill="both")

# Create menu
menu_bar = tk.Menu(root)
file_menu = tk.Menu(menu_bar, tearoff=0)
file_menu.add_command(label="Open", command=open_file)
file_menu.add_command(label="Save", command=save_file)
file_menu.add_separator()
file_menu.add_command(label="Exit", command=root.quit)
menu_bar.add_cascade(label="File", menu=file_menu)

edit_menu = tk.Menu(menu_bar, tearoff=0)
edit_menu.add_command(label="Copy", command=copy_text)
edit_menu.add_command(label="Cut", command=cut_text)
edit_menu.add_command(label="Paste", command=paste_text)
menu_bar.add_cascade(label="Edit", menu=edit_menu)

root.config(menu=menu_bar)

root.mainloop()
