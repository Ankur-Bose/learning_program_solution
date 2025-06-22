class ExcelDocumentFactory extends DocumentFactory {
    Document creaDocument() {
        return new ExcelDocument();
    }
}