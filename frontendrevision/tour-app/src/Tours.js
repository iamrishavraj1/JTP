import Tour from "./Tour";
const Tours = ({ tourData }) => {
  return (
    <>
      <div>
        <h1>Tours</h1>
        {tourData.map((item) => {
          return <Tour key={item.id} {...item} />;
        })}
      </div>
    </>
  );
};

export default Tours;
