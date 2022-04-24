const container = document.getElementsByClassName("main-frame");

function makeRows(rows, cols) {
    container.style.setProperty("--grid-rows", rows);
    container.style.setProperty("--grid-cols", cols);

    for (c=0; c < (rows*cols); c++) {
        let cell = document.createElement("div");
        cell.inheritText = (c + 1);
        container.appendChild(cell).className = "grid-item";
    };
};

makeRows(40, 40);