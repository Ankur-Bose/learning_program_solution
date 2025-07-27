import '../Stylesheets/mystyle.css'

const percentToDecimal = (decimal) => {
    return (decimal * 100).toFixed(2) + '%';
}

const calcScore = (total, goal) => {
    return percentToDecimal(total / goal);
}

export const CalculatorScore = ({ Name, School, Total, Goal }) => {
    return (
        <div className="formatstyle">
            <h1 style={{ color: 'brown' }}>Student Details</h1>
            <div className="Name">
                <b><span>Name : </span></b>
                <span>{Name}</span>
            </div>
            <div className="School">
                <b><span>School : </span></b>
                <span>{School}</span>
            </div>
            <div className="Total">
                <b><span>Total : </span></b>
                <span>{Total}</span>
                <span> Marks</span>
            </div>
            <div className="Score">
                <b>Score : </b>
                <span>{calcScore(Total, Goal)}</span>
            </div>
        </div>
    );
}